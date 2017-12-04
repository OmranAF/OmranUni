
public class Median {
	/*
	 * 
Erstellen Sie in Eclipse ein neues Projekt mit dem Namen EidP_VL08. Fügen Sie dem Projekt eine leere Java-Datei mit dem Namen Median.java hinzu.

a) Schreiben Sie ein Methode berechneDurchschnitt, die für ein gegebenes zweidimensionales Feld von int 
das arithmetische Mittel (Durchschnitt) der Werte berechnet und zurückgibt.

b) Schreiben Sie nun ein Methode berechneMedian, die für ein gegebenes eindimensionales Feld von int den Median berechnet. 
Der Median ist der mittlere Wert aller Werte im Feld.
Bei gerader Anzahl von Elementen nimmt man den Mittelwert der beiden mittleren Werte. Beispiel: Das Feld
1 5 4 3 8
hat den Median 4 (1,3 sind kleiner und 5,8 sind größer als 4).

c) Schreiben Sie eine main-Methode, in der Sie ein eindimensionales und ein zweidimensionales Feld von int erzeugen 
und mit Werten füllen und anschließend die Methoden aus a) und b) mit diesen Feldern testen.
Lassen Sie sich sowohl den Inhalt der Felder als auch die Ergebnisse der Methodenaufrufe auf der Konsole ausgeben.
	 */
	
	public static void berechneDurchschnitt(int[][]  zahlen) {
		
		int sum=0;
		int element=0;
		for(int i=0;i<zahlen.length;i++) {
			for(int j=0;j<zahlen[i].length;j++) {
				sum+=zahlen[i][j];
				element+=1;
				
			}
		}
		float average=sum/element;
		System.out.println(average);
	}
	public static int[] berechneMedian(int[] zahlen) {
		for(int i=0;i<zahlen.length-1;i++) {
			int min=i;
			for(int j=i+1;j<zahlen.length;j++) {
				if(zahlen[j]<zahlen[min]) {
					min=j;
				}
			int zw=zahlen[i];
			zahlen[i]=zahlen[min];
			zahlen[min]=zw;
			}
			return zahlen;
		}
		
		double median=0;
		int k=zahlen.length/2;
		if(zahlen.length%2==0) {
			
			median=(zahlen[k]+zahlen[k-1])/2;
			System.out.println("median= "+median);
		}else {
			median=zahlen[k];
			System.out.println("median="+median);

		}
		return zahlen;
	}
	
	
	
	//Main
	public static void main(String[] args) {
	
		int[][] zahle= {{1,3},{4,8},{3,5}};
		//berechneDurchschnitt(zahle);
		
		int[] zahle2= {1,5,4,3,8};
		int[] zahlen3= {2,4,5,6};
		System.out.println(berechneMedian(zahle2));
		System.out.println("-------------------");
		System.out.println(berechneMedian(zahlen3));
		

	}

}
