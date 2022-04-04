package com.git.abst;

abstract class Animal
{
	abstract void eat();
}
class Herbivores extends Animal
{
	void eat()
	{
		System.out.println("Im vegetarian");
	}
}
class Carnivores extends Animal
{
	void eat()
	{
		System.out.println("Im non-vegetarian");
	}
}


public class Example1 {

	public static void main(String[] args) 
	{
		Herbivores plant=new Herbivores();  
		Carnivores tiger=new Carnivores();
		plant.eat();
		tiger.eat();
	}
}
