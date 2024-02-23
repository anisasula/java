import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		Trekendesh[] lista;//array me keto kllapat
		lista = new Trekendesh[10];
		
		
		
		List<Trekendesh>lista1 = new ArrayList<Trekendesh>(); // ti mund te shtosh sa te duash sepse eshte konkrete
		//lista pranon objekte te natyrave te ndryshme sepse ka keto kllapa <>
		
		lista1.add(new Trekendesh());
		lista1.add(new Trekendesh("blu",true,2,3,4));
		lista1.add(0,new Trekendesh("kuqe",false,3,4,5));
		System.out.println("Numri i objekteve ne liste eshte "+lista1.size());
		for(Trekendesh t:lista1) {
			
		
			System.out.println(t.toString());
			
		}
		lista1.clear();
        System.out.println("Numri i objekteve ne liste eshte "+lista1.size());
        

	}

}
