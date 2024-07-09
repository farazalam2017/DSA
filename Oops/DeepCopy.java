public class DeepCopy {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Faraz";
    s1.roll = 456;
    s1.password = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 200;
    s1.marks[2] = 300;
    Student s2 = new Student(s1);//copy
    s2.password = "xyz";
    s1.marks[2] = 400;/* no change reflect */
    for (int i = 0; i < 3; i++) {
      System.out.println(s2.marks[i]);
    }
  }
}

class Student {
  String name;
  int roll;
  String password;
  int marks[];

  Student(Student s1) {
    marks = new int[3];
    this.name = name;
    this.roll = roll;
    for (int i = 0; i < marks.length; i++) {
      this.marks[i] = s1.marks[i];
    }
  }

  Student() {
    marks = new int[3];
    System.out.println("constructor is called...");
  }

  Student(String name) {
    this.name = name;
  }

  Student(int roll) {
    this.roll = roll;
  }
}