
public class DrejtkendeshTest {

	public static void main(String[] args) {
		Drejtkendesh d1 = new Drejtkendesh();
		d1.setBrinja1(2.0);
		d1.setBrinja2(5.0);
		d1.setNgjyra("Jeshile");
		d1.setNgjyrosur(true);
		System.out.println(d1);
		System.out.println("Perimetri i d1=  "+d1.getPerimeter());
		System.out.println("Siperfaqja e d1=  "+d1.getSiperfaqe());
	}

}
