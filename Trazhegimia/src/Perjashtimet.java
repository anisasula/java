import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception ose perjashtim eshte nje perjashtim na rrjedha normale e ekzekutimit te programit.
 * bllokun try-catch e gjen te surround with include try/catch
 */
public class Perjashtimet {

	public static void main(String[] args) {
		try {
			Scanner s= new Scanner(System.in);
			int n,m;
			System.out.println("Shkruaj nje numer te plote:");
			n=s.nextInt();
			System.out.println("Katrori i numrit eshte "+n*n);
			System.out.println("Shkruaj nje numer te plote:");
			m=s.nextInt();
			System.out.println("n pjestuar me m eshte"+n/m);
			String emri ="Java";
			System.out.println(emri.charAt(100));
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Gabim ne Input!"+e.toString());
		}
		catch(ArithmeticException e) {
			System.out.println("Kujdes pjesim me 0  "  +e.toString());
		}
		catch(Exception e) {
			System.out.println("Gabim i panjohur!"  +e.toString());
		}
		System.out.println("\nFund programi");

	}

}
