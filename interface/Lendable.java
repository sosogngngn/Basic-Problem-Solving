package study08_interface2;

public interface Lendable {
	public void checkOut(String borrower, String date, byte state) throws Exception;
	public void checkIn(byte state);

}
