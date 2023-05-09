package org.shop.java.pojo;

import java.util.Random;

public class Smartphone extends Prodotto{
	
	private int imei;
	private int memoria;
	
	Random r = new Random();
	
	public Smartphone(String nome, String marca, int prezzo, int iva,
						int memoria) {
		
		super(nome, marca, prezzo, iva);
		
		imei = r.nextInt(999999);
		setMemoria(memoria);
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		
		return "(S) " + getProductString()
			+ "\nimei: " + getImei()
			+ "\nmemoria disponibile: " + getMemoria() + "GB";
	}
}
