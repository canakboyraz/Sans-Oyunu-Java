/**
*
* @author Can Akboyraz - canakboyraz@gmail.com
* @since 19.05.2023
* <p>
* Şans oyunumuz için gerekli toplama çıkarma çarpma işlemlerini uyguladığım metodlar burada.
* </p>
*/

package com.sakarya.java.oyun;

import java.util.Random;

public class Formul {
	
	static Masa masa = new Masa();
	
	public static Kisi hesap(Kisi kisi, int rastgeleSayi) {
	
		double yatırılanPara = kisi.getPrice()*kisi.getRate();
		double kalanPara = kisi.getPrice()-yatırılanPara; 
		
		
		if(kisi.getNumber() == rastgeleSayi) {
			kisi.setPrice(kalanPara+(yatırılanPara*10));
			masaParası(yatırılanPara*10,false);
		}
		else {
			kisi.setPrice(kalanPara);
			masaParası(yatırılanPara,true);
		}
		return kisi;
	}
	public static void masaParası(double para,boolean kazandiMi) {
		double toplamMasaParasi = 0;
		
		if(kazandiMi) {
			toplamMasaParasi = masa.getPara() + para;
		}else {
			toplamMasaParasi = masa.getPara() - para;
		}
		masa.setPara(toplamMasaParasi);
	}
	
	public static double getMasaParas() {
		return masa.getPara();
	}
	
}
