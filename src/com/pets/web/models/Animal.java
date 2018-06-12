package com.pets.web.models;

public class Animal implements pet{
	private String name;
	private String breed;
	private int weight;
	public Animal(){
		this.name = "";
		this.breed ="";
		this.weight = 0;
	}
	public Animal(String Name, String Breed, int Weight) {
		this.name = Name;
		this.breed = Breed;
		this.weight = Weight;
	}
	
	public void showAffection() {
		System.out.println(this.name +" cuddles up to you.");
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	public void setBreed(String Breed) {
		this.breed = Breed;
	}
	public void setWeight(int Weight) {
		this.weight = Weight;
	}
	public String getName() {
		return this.name;
	}
	public String getBreed() {
		return this.breed;
	}
	public int getWeight() {
		return this.weight;
	}
}
