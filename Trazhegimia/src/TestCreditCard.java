
public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard cr1 = new CreditCard("John Doe", "Intensa San Barbara Unt", "5391 0375 9378 5309",3000,0.0);
		cr1.charge(1000.0);
		System.out.println("Balanca e kartes = " + cr1.getBalance());
		cr1.charge(2500.0);
		System.out.println("Balanca e kartes = " + cr1.getBalance());
		cr1.makePayment(500);
		System.out.println("Balanca e kartes = " + cr1.getBalance());
		cr1.charge(2500.0);
		System.out.println("Balanca e kartes = " + cr1.getBalance());
	}
	PredatoryCreditCard pr1 = new PredatoryCreditCard();

		
}