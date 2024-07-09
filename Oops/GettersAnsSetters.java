public class GettersAnsSetters {
  public static void main(String args[]) {
    Pen p1 = new Pen();
    p1.setColor("orange");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setColor("aqua");
    System.out.println(p1.getColor());
    // myAcc.password = "abs";//not allowed as password is private
  }
}

class Pen {
  private String color;
  private int tip;

  String getColor() {//getter
    return this.color;
  }

  int getTip() {
    return this.tip;
  }
  void setColor(String newColor) {//setter
    this.color = newColor;
  }

  void setTip(int newTip) {
    this.tip = newTip;
  }
}

