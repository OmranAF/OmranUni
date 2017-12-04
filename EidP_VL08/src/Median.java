import java.lang.reflect.Array;
import java.util.Arrays;

public class Median {
	/*
	 * 
	 * Erstellen Sie in Eclipse ein neues Projekt mit dem Namen EidP_VL08. F�gen Sie
	 * dem Projekt eine leere Java-Datei mit dem Namen Median.java hinzu.
	 * 
	 * a) Schreiben Sie ein Methode berechneDurchschnitt, die f�r ein gegebenes
	 * zweidimensionales Feld von int das arithmetische Mittel (Durchschnitt) der
	 * Werte berechnet und zur�ckgibt.
	 * 
	 * b) Schreiben Sie nun ein Methode berechneMedian, die f�r ein gegebenes
	 * eindimensionales Feld von int den Median berechnet. Der Median ist der
	 * mittlere Wert aller Werte im Feld. Bei gerader Anzahl von Elementen nimmt man
	 * den Mittelwert der beiden mittleren Werte. Beispiel: Das Feld 1 5 4 3 8 hat
	 * den Median 4 (1,3 sind kleiner und 5,8 sind gr��er als 4).
	 * 
	 * c) Schreiben Sie eine main-Methode, in der Sie ein eindimensionales und ein
	 * zweidimensionales Feld von int erzeugen und mit Werten f�llen und
	 * anschlie�end die Methoden aus a) und b) mit diesen Feldern testen. Lassen Sie
	 * sich sowohl den Inhalt der Felder als auch die Ergebnisse der Methodenaufrufe
	 * auf der Konsole ausgeben.
	 */

	public static void berechneDurchschnitt(int[][] zahlen) {
		int sum = 0;
		int element = 0;
		for (int i = 0; i < zahlen.length; i++) {
			for (int j = 0; j < zahlen[i].length; j++) {
				sum += zahlen[i][j];
				element += 1;

			}
		}
		float average = sum / element;
		System.out.println(average);
	}

	public static int[] sortiereArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
				int zw = array[i];
				array[i] = array[min];
				array[min] = zw;
			}
			/**
			 * Fehler: Wenn du einen return in der for-Schleife machst, wird nur eine
			 * Iteration durchgeführt!
			 */
			// return array;
		}
		//Korigiert: hier musst du returnen, wenn alles sortiert ist
		return array;
	}

	/**
	 * Methode nimmt ein Array als Parameter und schreibt alle Elemente in die
	 * Konsole!
	 */
	public static void printArraytoConsole(int[] array) {
		//Mit vordefinierter Java-Methode: 
		System.out.println(Arrays.toString(array));
		
		//--------------------------------------------------------
		//Oder selbst-geschrieben:
		String ausgabe ="[";
		
		//For-Each-Schleife (Für jedes Element wird eine Aktion gemacht)
		for(int i : array) {
			ausgabe = ausgabe + i+", ";
		}
		//entferne letztes ", "
		ausgabe = ausgabe.substring(0, ausgabe.length()-2);
		ausgabe = ausgabe + "]";
		
		System.out.println(ausgabe);
	}

	public static int[] berechneMedian(int[] zahlen) {
		// Code in eigene Methode verschoben! [sortiereArray(int[] zahlen)]
		zahlen = sortiereArray(zahlen);
		double median = 0;
		int k = zahlen.length / 2;
		if (zahlen.length % 2 == 0) {

			median = (zahlen[k] + zahlen[k - 1]) / 2;
			System.out.println("median= " + median);
		} else {
			median = zahlen[k];
			System.out.println("median=" + median);

		}
		return zahlen;
	}

	// Main
	public static void main(String[] args) {

		int[][] zahle = { { 1, 3 }, { 4, 8 }, { 3, 5 } };
		// berechneDurchschnitt(zahle);

		int[] zahle2 = { 1, 5, 4, 3, 8 };
		int[] zahlen3 = { 2, 4, 5, 6 };
		
		//ARRAY AUSGEBEN:
		printArraytoConsole(zahle2);
		
		System.out.println(berechneMedian(zahle2));
		System.out.println("-------------------");
		System.out.println(berechneMedian(zahlen3).toString());

	}

}
