/**
*
* @author Can Akboyraz - canakboyraz@gmail.com
* @since 21.05.2023
* <p>
* Main classımız .txt dosya okumasını yapıp liste tanımladım. Ekran çıktısında istenilene göre formül classımızdaki metodları çağırıp işleme soktum.
* </p>
*/

package com.sakarya.java.oyun;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SansOyunu {
	
	

	public static void main(String[] args) {
		
		try {
			List<Kisi> oyuncuListesi = DosyaOkuma.dosyaOkuma();
			Masa masa = new Masa();
			masa.setPara(0);
			
			int count = 0 ;
			List<Kisi> silinecekKisi = new ArrayList<>();
			while(oyuncuListesi.size()>0) {
				Random rastgele = new Random();
				int rastgeleSayi = rastgele.nextInt(10) + 1;		
				for (Kisi kisi: oyuncuListesi) {
					Formul.hesap(kisi, rastgeleSayi);
					if(kisi.getPrice()<1000) {
						silinecekKisi.add(kisi);
					}
				}
				
				oyuncuListesi.removeAll(silinecekKisi);		
				double enZengin=0;
				String enZenginKisi = "";
				
				for(int i = 0; i < oyuncuListesi.size();i++) {
					if(oyuncuListesi.get(i).getPrice()>enZengin) {
						enZengin = oyuncuListesi.get(i).getPrice();
						enZenginKisi = oyuncuListesi.get(i).getName();
					}
				}	
				count ++;
				System.out.println();
				System.out.println("###############################################");
				System.out.println("##" +"               ŞANSLI SAYI : " + rastgeleSayi + "            ##"  );
				System.out.println("###############################################");
				System.out.println("###############################################");
				System.out.println(count +" . tur");
				System.out.println("###############################################");
				System.out.println("############# " + " En zengin kişi : " + "###############");
				System.out.println("#############    " + enZenginKisi + " #####################");
				System.out.println("######## " + " Bakiyesi : " + enZengin + " #######");
				System.out.println("######## " + "Masanın bakiyesi " + Formul.getMasaParas()+ " #######");
				System.out.println("###############################################");
				
			}					
		} 
		catch (NumberFormatException e) {			
			throw e;
		} 
	}
}
