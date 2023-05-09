package org.shop.java.pojo;

public class Televisori extends Prodotto{
	
	private int dimensioni;
	private boolean smart;
	
	public Televisori(String nome, String marca, int prezzo, int iva,
							int dimensioni, boolean smart) {
		
		super(nome, marca, prezzo, iva);
		
		setDimensioni(dimensioni);
		setSmart(smart);
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		
		return "(T) " + getProductString()
			+ "\ndimensioni: " + getDimensioni() + "Pollici"
			+ "\nè smart: " + isSmart();
	}
}
