public class AccessModifiier {
  public static void main(String args[]) {
    Pen p1 = new Pen();
    p1.setColor("orange");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    BankAccount myAcc = new BankAccount();
    myAcc.username = "Faraz Alam";
    // myAcc.password = "abs";//not allowed as password is private
  }
}

class BankAccount {
  public String username;
  private String password;

  public void setPassword(String pwd) {
    password = pwd;
  }

}
class Pen {
  String color;
  int tip;

  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}

class Student {
  String name;
  int age;
  float percentage;

  void calcuPercentage(int phy, int chem, int math) {
    percentage = (phy + chem + math) / 3;

  }
}