
public class TestStudent {

	public static void main(String[] args) {
		Student anisa =  new Student("Anisa Sula","Tirona","0678945678","anisasula04@gmail.com",Status.VITIDYTE);
		anisa.setStatus(Status.VITIDYTE);
		if(anisa.getStatus()== Status.VITIDYTE) {
			System.out.println("Anisa eshte ne vitin e dyte");
		}
		System.out.println(anisa);
		
	}

}

