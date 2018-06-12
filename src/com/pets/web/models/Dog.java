package com.pets.web.models;

public class Dog extends Animal{
	public Dog(String Name, String Breed, int Weight) {
		this.setName(Name);
		this.setName(Breed);
		this.setWeight(Weight);
	}
	public void showAffection() {
		if (this.getWeight() < 30) {
			System.out.println("The dog jumps excitedly up and down while barking.");
		}
		else {
			System.out.println("The dog wags his tail and eagerly woofs.");
		}
	}
}
