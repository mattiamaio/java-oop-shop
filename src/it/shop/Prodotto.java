package it.shop;

import java.util.Random;

public class Prodotto {

	// attributi
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;

	// costruttori
	public Prodotto() {
		this.codice = generaCodice();

	}

	public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
		this.codice = generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// getter-setter
	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (inputValido(nome)) {
			System.out.println("Campo nome deve essere compilato");
		} else {
			this.nome = nome;
		}

	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		if (inputValido(descrizione)) {
			System.out.println("Campo descrizione deve essere compilato");
		} else {
			this.descrizione = descrizione;
		}

	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if (prezzoValido(prezzo)) {
			System.out.println("Prezzo deve essere maggiore di zero");
		} else {
			this.prezzo = prezzo;
		}

	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		if (ivaValida(iva)) {
			System.out.println("Iva deve essere maggiore di zero");
		} else {
			this.iva = iva;
		}

	}

	// metodi
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt(500);
	}

	private boolean inputValido(String input) {
		return input == null || input.length() == 0;
	}

	private boolean prezzoValido(double prezzo) {
		return prezzo <= 0;
	}

	private boolean ivaValida(double iva) {
		return iva <= 0;
	}

	public String nomeProdotto() {
		return nome + " " + codice;
	}

	public double prezzoConIva() {
		return prezzo + ((prezzo * iva) / 100);
	}

}
