package org.shop.java;

import java.util.Scanner;

import org.shop.java.pojo.Cuffie;
import org.shop.java.pojo.Smartphone;
import org.shop.java.pojo.Televisori;
import org.shop.java.pojo.Prodotto;

public class Catalogo {
	
	public static void main(String[] args) {
		
		Prodotto[] productArr = new Prodotto[100];
		
		Scanner in = new Scanner (System.in);
		
		for(int i = 0; i < productArr.length; i++) {
			
			System.out.println("Inserisci un valore in base al prodotto da aggiungere: ");
			System.out.println("1- voglio aggiungere un telefono");
			System.out.println("2- voglio aggiungere un televisore");
			System.out.println("3- voglio aggiungere un paio di cuffie");
			
			
			int choice = in.nextInt();
			
			if (choice < 1 || choice > 3) {
				continue;
			}
			
			switch (choice) {
			
			case 1: {
				
				System.out.println("Inserisci nome del telefono");
				String nome = in.next();
				
				System.out.println("Inserisci marca del telefono");
				String marca = in.next();
				
				System.out.println("Inserisci prezzo del telefono");
				int prezzo = in.nextInt();
				
				System.out.println("Inserisci percentuale iva del telefono");
				int iva = in.nextInt();
				
				System.out.println("Inserisci memoria del telefono");
				int memoria = in.nextInt();
				
				productArr[i] = new Smartphone(nome, marca, prezzo, iva, memoria);
				
				System.out.println(productArr[i]);
				
			}
			break;
			
			case 2: {

				System.out.println("Inserisci nome del televisore");
				String nome = in.next();
				
				System.out.println("Inserisci marca del televisore");
				String marca = in.next();
				
				System.out.println("Inserisci prezzo del televisore");
				int prezzo = in.nextInt();
				
				System.out.println("Inserisci percentuale iva del televisore");
				int iva = in.nextInt();
				
				System.out.println("Inserisci dimensioni del televisore");
				int dimensioni = in.nextInt();
				
				System.out.println("Il televisore è smart?");
				boolean smart = in.nextBoolean();
				
				productArr[i] = new Televisori(nome, marca, prezzo, iva, dimensioni, smart);
				
				System.out.println(productArr[i]);
			}
			break;
			
			case 3: {

				System.out.println("Inserisci nome delle cuffie");
				String nome = in.next();
				
				System.out.println("Inserisci marca delle cuffie");
				String marca = in.next();
				
				System.out.println("Inserisci prezzo delle cuffie");
				int prezzo = in.nextInt();
				
				System.out.println("Inserisci percentuale iva delle cuffie");
				int iva = in.nextInt();
				
				System.out.println("Inserisci il colore delle cuffie");
				String colore = in.next();
				
				System.out.println("Le cuffie sono wireless?");
				boolean wireless = in.nextBoolean();
				
				productArr[i] = new Cuffie(nome, marca, prezzo, iva, colore, wireless);
				
				System.out.println(productArr[i]);
				
			}
			break;

		}
		}
		in.close();
		
	}
}
