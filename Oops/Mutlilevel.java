public class Mutlilevel {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.eat();
    d1.legs = 4;
    System.out.println(d1.legs);
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
class Mammals extends Animal {
  int legs;
}

class Dog extends Mammals {
  String breed;
}