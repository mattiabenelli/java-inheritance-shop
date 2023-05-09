package org.shop.java;

	import org.shop.java.pojo.Cuffie;
	import org.shop.java.pojo.Smartphone;
	import org.shop.java.pojo.Televisori;
	import org.shop.java.pojo.Prodotto;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------\n");
		
		Prodotto p1 = new Prodotto("prodotto", "marca", 100, 22);
		System.out.println(p1);
		
		System.out.println("------------------------------------\n");
		
		Cuffie c1 = new Cuffie("cuffie", "yamaha", 100, 22, "verde", true);
		System.out.println(c1);
		
		System.out.println("------------------------------------\n");
		
		Smartphone s1 = new Smartphone("iphone", "apple", 200, 22, 64);
		System.out.println(s1);
		
		System.out.println("------------------------------------\n");
		
		Televisori t1 = new Televisori("televisore", "samsung", 1000, 22, 55, false);
		System.out.println(t1);
		
		System.out.println("------------------------------------\n");
		
		System.out.println("\n------------------------------------");
		System.out.println("------------------------------------\n");
		
		
		Prodotto[] pArr = { p1, c1, s1, t1};
		
		for (int x=0;x<pArr.length;x++) {
			
			Prodotto p = pArr[x];
			System.out.println(p.toString());
			
			System.out.println("\n------------------------------------\n");
			if (p instanceof Smartphone) {
				
				Smartphone s = (Smartphone) p;
				System.out.println(s.getMemoria());
				
			} else if (p instanceof Cuffie) {	
				
				Cuffie c = (Cuffie) p;
				System.out.println(c.getColore());
			}
			
			else if (p instanceof Televisori) {
				
				Televisori t = (Televisori) p;
				System.out.println(t.getDimensioni());
			}
		}
	
	}
}
