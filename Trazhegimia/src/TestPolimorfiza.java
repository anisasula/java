/**
 * ObjektGjeometrik r = new Rrethi();
 * variablri r eshte nje objekt reference dhe ka si tip te deklaruar ObjektGjeometrik dhe tip aktual klasen
 * Rrethi.quhet ndryshe variablri POLIMORF
 * r.toString() do therritet
  */
public class TestPolimorfiza {
	public static void main(String[] args) {
	ObjektGjeometrik r = new Rrethi();
	r.setNgjyra("GRI");
	System.out.println(r.toString());
	ObjektGjeometrik o; // variabel shumeformesh
	o = new Trekendesh("kuqe", true,3.0,4.0,5.0);
	System.out.println(o);
	o = new Drejtkendesh("Blu",false,3.5,2.7);
	System.out.println(o);
	ObjektGjeometrik []	lista= new ObjektGjeometrik[5];
	lista[0]= new Rrethi("verdhe",false,3.5);
	lista[1]=new Trekendesh("blu",true,3,4,5);
	lista[2]=o;
	lista[3]=new Katrori("white",false,10);
	printSiperfaqe(lista);
	}
public static void printSiperfaqe(ObjektGjeometrik[]lista) {
	for(ObjektGjeometrik o:lista) {
		String emri="";
		if(o instanceof Rrethi)emri= "  e rrethit";
		else if (o instanceof Trekendesh)emri="  e trekendeshit";
			else if (o instanceof Katrori)emri="  e katrorit";
	        else if (o instanceof Drejtkendesh)emri="  e drejtkendeshit";
		else {
			System.out.println("Objekt gjeometrik i panjohur!");
			return;
		}
		System.out.println("Siperfaqja "+emri+"="+o.getSiperfaqe());
	}
}
}
