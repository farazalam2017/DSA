public class Inheritance {
  public static void main(String[] args) {
    Fish tuna = new Fish();
    tuna.eat();
  }
}

//Base class
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathe");
  }
}
//Derived Class
class Fish extends Animal {
  int fins;

  void swim() {
   System.out.println("swim in water"); 
  }
}