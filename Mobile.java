package week1.day1;

public class Mobile {
	long mobimeNumber = 9788803765L;
	float mobliePrice = 20000.12f;
	String brandName = "Apple";
	boolean fullcharge = true;

	public void sendSms() {
		System.out.println("Sendsms to vasanth");

	}

	public void takePhoto() {
		System.out.println("Take selfi with vasanth");

	}

	public void makecall() {
		System.out.println("Make call to vasanth");

	}

	public static void main(String[] args) {
		Mobile sms = new Mobile();
		
		/*
		 * //global varible print in main method //
		 */		
		System.out.println("Brand name is" +sms.brandName);
		System.out.println("Charge is " +sms.fullcharge);
		System.out.println("Mobile number is " +sms.mobimeNumber);
		System.out.println("Mobile price is " +sms.mobliePrice);
//		Mobile photo = new Mobile();
//		photo.takePhoto();
//		Mobile makeCall = new Mobile();
//		makeCall.makecall();
	}

}
