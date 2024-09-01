public class Website {
  String name;
  int id;

  Website(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public static void main(String[] args) {
    Website obj1 = new Website("HelloWorld", 3);
    Website obj2 = new Website("HelloWorld", 3);
    System.out.println(obj1.name+", "+obj1.id);
    System.out.println(obj2.name+", "+obj2.id);
  }
}
