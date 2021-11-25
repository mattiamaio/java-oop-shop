package it.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// dati prodotto vuoti
		Prodotto prodotto1 = new Prodotto();
		System.out.println("Nome esteso: " + prodotto1.nomeProdotto() + "\nCodice prodotto: " + prodotto1.getCodice()
				+ "\nNome del prodotto: " + prodotto1.getNome() + "\nDescrizione del prodotto: "
				+ prodotto1.getDescrizione() + "\nPrezzo del prodotto senza IVA: " + prodotto1.getPrezzo() + " \u20ac"
				+ "\nPrezzo del prodotto con IVA: " + prodotto1.prezzoConIva() + " \u20ac");

		// dati prodotto inseriti manualmente
		Prodotto prodotto2 = new Prodotto(0, "Ciabatte", "Un paio di ciabbatte", 20, 22);
		System.out.println("Nome esteso: " + prodotto2.nomeProdotto() + "\nCodice prodotto: " + prodotto2.getCodice()
				+ "\nNome del prodotto: " + prodotto2.getNome() + "\nDescrizione del prodotto: "
				+ prodotto2.getDescrizione() + "\nPrezzo del prodotto senza IVA: " + prodotto2.getPrezzo() + " \u20ac"
				+ "\nPrezzo del prodotto con IVA: " + prodotto2.prezzoConIva() + " \u20ac");

		// dati prodotto con input utente
		Prodotto prodotto3 = new Prodotto(0, null, null, 0, 0);
		System.out.print("Inserisci nome prodotto: ");
		prodotto3.setNome(scanner.nextLine());
		System.out.print("Inserisci descrizione prodotto: ");
		prodotto3.setDescrizione(scanner.nextLine());
		System.out.print("Inserisci prezzo prodotto: ");
		prodotto3.setPrezzo(scanner.nextDouble());
		System.out.print("Inserisci iva: ");
		prodotto3.setIva(scanner.nextDouble());
		System.out.println("Nome esteso: " + prodotto3.nomeProdotto() + "\nCodice prodotto: " + prodotto3.getCodice()
				+ "\nNome del prodotto: " + prodotto3.getNome() + "\nDescrizione del prodotto: "
				+ prodotto3.getDescrizione() + "\nPrezzo del prodotto senza IVA: " + prodotto3.getPrezzo() + " \u20ac"
				+ "\nPrezzo del prodotto con IVA: " + prodotto3.prezzoConIva() + " \u20ac");

		scanner.close();
	}

}
