package net.alcosmos.decoder.decoder;

public class B64Decoder {
	/*
	 * Base64
	 */
	public static int decode(char[] input) throws Exception {
		int output = 0;
		int exp = input.length - 1;
		
		for (int i = 0; i < input.length; i++) {
			output += ((int)input[i] % 64) * (int)Math.pow(64, exp);
			exp--;
		}
		
		return output;
	}
	
	public static String encode(int input) throws Exception {
		String output = Character.toString((char)(input / 64 + 64)) + (char)(input % 64 + 64);
		return output;
	}
}
