package training.java10;

public class Java10 {
  private static String name = "";

  void varType() {
    var firstName = "Anton";
    var age = 99;
    System.out.println(firstName.getClass());
    System.out.println(((Object)age).getClass());
  }

  public static void main(String [] args) {
    Java10 java10 = new Java10();
    java10.varType();
  }
}
