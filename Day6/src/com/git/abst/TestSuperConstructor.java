package com.git.abst;

class Tiger
{
  Tiger() 
  {
    System.out.println("I am an animal");
  }

  Tiger(String type) 
  {
    System.out.println("Type: "+type);
  }
}

class Cat extends Tiger 
{
  Cat() 
  {
    super("Tiger");

    System.out.println("I am a dog");
  }
}

class TestSuperConstructor {
  public static void main(String[] args) {
    Cat dog1 = new Cat();
  }
}