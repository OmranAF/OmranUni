
public class BruchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// für kehrwert methode
		Bruch b = new Bruch(3, 4);
		// multiplitzieren
		Bruch k = new Bruch(2, 5);
		Bruch d = new Bruch(5, 7);
		// addieren mit d
		Bruch s = new Bruch(2, 5);

		// addieren
		Bruch a = new Bruch(1, 4);
		Bruch h = new Bruch(1, 2);

		b = b.kehrwert();
		System.out.println(b);
		k = k.multiplizieren(d);
		System.out.println(k+"\n---\n");
		
		
		System.out.println(d.addieren(s));
		System.out.println(d.addieren2(s));

	}

}
