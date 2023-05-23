package com.sakarya.java.oyun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class DosyaOkuma {
	public static List<Kisi> dosyaOkuma() {
		List<Kisi> kisiListe = new ArrayList<>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("kisiler.txt"));
			String line = null;
			String specialCharacter = "#";
			try {
				while ((line = bufferedReader.readLine()) != null) {
					Kisi kisi = new Kisi();
					String[] values = line.split(specialCharacter);		
					kisi.setName(values[0]);
					kisi.setPrice(Double.parseDouble(values[1]));
					kisi.setRate(Double.parseDouble(values[2]));
					kisi.setNumber(Integer.parseInt(values[3]));
					kisiListe.add(kisi);
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return kisiListe;
	}

}
