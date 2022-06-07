package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusCalcolaBiglietto {

	public static void main(String[] args) {
		double numeroChilometri;
		int etaPasseggero;
		double scontoMinorenni = 0.20;
		double scontoOver65 = 0.40;
		double costoAlKm = 0.21;
		
		DecimalFormat df = new DecimalFormat(".00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci numero di chilometri: ");
		numeroChilometri = input.nextDouble();
		
		System.out.print("Inserisci età passeggero: ");
		etaPasseggero = input.nextInt();
		
		double prezzoTotale = numeroChilometri * costoAlKm;
		double scontoSulPrezzoMinorenni = prezzoTotale * scontoMinorenni;
		double scontoSulPrezzoOver65 = prezzoTotale * scontoOver65;
		double prezzoFinaleMinorenni = prezzoTotale - scontoSulPrezzoMinorenni;
		double prezzoFinaleOver65 = prezzoTotale - scontoSulPrezzoOver65;
		
		if (etaPasseggero >=0 && numeroChilometri >=0 ) {
			if (etaPasseggero < 18) {
				System.out.println("Il costo del biglietto è di: " + df.format(prezzoFinaleMinorenni) + "€");
			} else if (etaPasseggero > 65) {
				System.out.println("Il costo del biglietto è di: " + df.format(prezzoFinaleOver65) + "€");
			} else {
				System.out.println("Il costo del biglietto è di: " + df.format(prezzoTotale) + "€");
			} 
		} else {
			System.out.println("Età o numero chilometri sono negativi e quindi non esatti. Riprovare.");
		}
		input.close();
	}

}