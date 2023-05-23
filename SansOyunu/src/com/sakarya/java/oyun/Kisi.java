/**
*
* @author Can Akboyraz - canakboyraz@gmail.com
* @since 18.05.2023
* <p>
* Kişi için ilgili modeli oluşturduğum class
* </p>
*/
package com.sakarya.java.oyun;

public class Kisi {
	@Override
	public String toString() {
		return "Kisi [name=" + name + ", price=" + price + ", rate=" + rate + ", number=" + number + "]";
	}
	private String name;
	private double price;
	private double rate;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
