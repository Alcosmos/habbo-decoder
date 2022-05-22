package net.alcosmos.decoder.decoder;

import java.util.Arrays;

public class VL64Decoder {
	public static int getLength(byte input) {
		return (input - 64) / 8;
	}
	
	public static int decode(char[] input) throws Exception {
		int output = input[0] & 3;
		int length = (input[0] - 64) / 8;
		
		for (int i = 0; i < length; i++) {
			output += ((int)input[i] - 64) * ((int)Math.pow(64, i) / 16);
		}
		
		return (input[0] & 7) < 4 ? output : -output;
	}
	
	public static String encode(int input) throws Exception {
		int posInput = Math.abs(input);
		int length = 1;
		byte[] output = new byte[6];
		
		output[0] = (byte)((posInput & 3) + (input >= 0 ? 64 : 68));
		posInput /= 4;
		
		for (int i = 1; i <= 5; i++) {
			output[i] = (byte)(posInput % 64 + 64);
			posInput /= 64;
			if (output[i] != 64) length = i + 1;
		}
		
		output[0] += (byte)(length * 8);
		return new String(Arrays.copyOf(output, length));
	}
}
