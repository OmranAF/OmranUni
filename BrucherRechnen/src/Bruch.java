
public class Bruch {

	private int zaehler;
	private int nenner;

	public Bruch() {
		this.zaehler = 1;
		this.nenner = 1;
	}

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public int getNenner() {
		return nenner;
	}

	public int getZaehler() {
		return zaehler;
	}

	// kehrwert
	public Bruch kehrwert() {
		int t = zaehler;
		zaehler = nenner;
		nenner = t;
		Bruch newBruch = new Bruch(zaehler, nenner);
		return newBruch;
	}

	// addieren
	public Bruch addieren(Bruch b) {
		if (nenner % b.getNenner() == 0) {
			int k = nenner / b.getNenner();
			int kZaehler = k * b.getZaehler();
			int newZahler = kZaehler + zaehler;
			int newNenner = nenner;
			Bruch newBruch = new Bruch(newZahler, newNenner);

			return newBruch;
		} else if (b.getNenner() % nenner == 0) {
			int k = b.getNenner() / nenner;
			int kZaehler = k * zaehler;
			int newZahler = kZaehler + b.getZaehler();
			int newNenner = b.getNenner();
			Bruch newBruch = new Bruch(newZahler, newNenner);

			return newBruch;
		} else {
			int kZaehler = zaehler * b.getNenner();
			int dZaehler = b.getZaehler() * nenner;
			int newZaehler = kZaehler + dZaehler;
			int newNenner = nenner * b.getNenner();
			Bruch newBruch = new Bruch(newZaehler, newNenner);
			return newBruch;
		}

	}

	// multiplizieren
	public Bruch multiplizieren(Bruch b) {
		int newZaehler = zaehler * b.getZaehler();
		int newNenner = nenner * b.getNenner();
		Bruch newBruch = new Bruch(newZaehler, newNenner);
		return newBruch;
	}

	@Override
	public String toString() {

		return zaehler + "/" + nenner;
	}
}
