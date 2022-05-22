package net.alcosmos.decoder;

public enum PageType {
	PAGE1(1),
	PAGE2(2),
	PAGE3(3),
	PAGE4(4);
	
	private int value;
	
	PageType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
