
public class KatroriTest {

	public static void main(String[] args) {
		Katrori k1 = new Katrori(null, false, 0, 0);
		k1.setBrinja1(10.0);
		k1.setBrinja2(10.0);
		k1.setNgjyra("jeshile");
		k1.setNgjyrosur(true);
		//System.out.println(k1);
		System.out.println("Perimetri i katrorit=  "+k1.getPerimeter());
		System.out.println("Siperfaqja e katrorit=  "+k1.getSiperfaqe());

	}

}
