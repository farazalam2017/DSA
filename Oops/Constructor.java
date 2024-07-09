public class Constructor {
  public static void main(String[] args) {
    Student s1 = new Student("Faraz Alam");
    Student s2 = new Student();
    Student s3 = new Student(123);
    System.out.println(s1.name);

  }
}

class Student {
  String name;
  int roll;

  Student() {/* non-parametrized */
    System.out.println("constructor is called...");
  }
  Student(String name) {/* parametrized constructor */
    this.name = name;
  }

  Student(int roll) {
    this.roll = roll;
  }
}