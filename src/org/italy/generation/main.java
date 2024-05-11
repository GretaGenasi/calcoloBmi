package org.italy.generation;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float altezza;
		int peso;
		float bmi;
		String risposta = "s";
		
		do {
		do {
		System.out.print("Inserisci il tuo peso in kg: ");
		peso = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Inserisci la tua altezza in m: ");
		altezza = sc.nextFloat();
		sc.nextLine();
		
		bmi = peso/(altezza*altezza);
		System.out.println("Il tuo bmi è pari a "+String.format("%.2f",bmi));
		
		if ((peso<0 || altezza<0))
			System.out.println("I dati inseriti non sono corretti, riprovare.");
			
		} while (peso<0 || altezza<0);
		
		
		if (bmi<16)
			System.out.println("Il tuo indice bmi corrisponde a grave magrezza.");
		else if (bmi<18.50)
			System.out.println("Il tuo indice bmi corrisponde a sottopeso.");
		else if (bmi < 24.50)
			System.out.println("Il tuo indice bmi corrisponde a normopeso.");
		else if (bmi<30)
			System.out.println("Il tuo indice bmi corrisponde a sovrappeso.");
		else if (bmi<35)
			System.out.println("Il tuo indice bmi corrisponde a obeso classe 1.");
		else if (bmi <40)
			System.out.println("Il tuo indice bmi corrisponde a obeso classe 2.");
		else
			System.out.println("Il tuo indice bmi corrisponde a obeso classe 3.");
		
		System.out.println("Vuoi effettuare un altro calcolo? (s/n)");
		risposta = sc.nextLine();
		
		} while (risposta.equalsIgnoreCase("s"));
		
		System.out.println("Grazie e arrivederci.");
		
		
	} //Chiusura main

	private static String toFixed(float bmi, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
