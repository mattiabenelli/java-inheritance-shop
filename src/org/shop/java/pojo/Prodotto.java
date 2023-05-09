package org.shop.java.pojo;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	Random r = new Random();
	
	public Prodotto(String nome, String marca, int prezzo, int iva) {
		
		codice = r.nextInt(999999);
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public int getIvaPrice() {
		
		return (int) (getPrezzo() * (1 + getIva() / 100f));
	}
	
	@Override
	public String toString() {

		return "[" + getCodice() + "] " + getNome()
			+ "\n" + getMarca()
			+ "\n" + getPrezzo()  + "$ (" + getIva() + "%)"
			+ " --> " + getIvaPrice() + "$";
	}
}
