/**
 * Create a program that keeps track of students fees
 * fees already paid
 * teachers salary
 */
/**
* Create a class called Student to represent a student of school.
* A Student should have the following information as instance variables:
* id – unique – type integer
* name – type String
* fees paid – type double
* add a method payFee to use for payment registration
*/

public class Studenti {
	
	private int id;
	private String name;
	private double feesPaid;
	
	public Studenti() {
	}
	
	public Studenti( int id,String name,double feePaid) {
		this.id=id;
		this.name=name;
		this.feesPaid=0.0;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the feesPaid
	 */
	public double getFeesPaid() {
		return feesPaid;
	}
	
	// Method to pay fees
    public void payFee(double amount) {
        if (amount < 0) {
            System.out.println(" Fee payment failed.");
            return;
        }
        feesPaid += amount;
        System.out.println("Fee of $" + amount + " paid successfully for student " + name);
    }

    // Method to get remaining fees
    public double getRemainingFees(double totalFees) {
        return totalFees - feesPaid;
    }
	

}
