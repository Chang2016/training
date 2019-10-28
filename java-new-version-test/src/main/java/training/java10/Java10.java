package training.java10;

import java.util.Map;

public class Java10 {
  private static String name = "";

  void varType() {
    var firstName = "Anton";
    var age = 99;
    System.out.println(firstName.getClass());
    System.out.println(((Object)age).getClass());
  }

  static Map<Integer, String> varMap() {
    var map = Map.of(1, "lala", 2, "huhu");
    return map;
  }

  public static void main(String [] args) {
    Map<Integer, String> map = varMap();
    map.entrySet().forEach(System.out::println);
    Java10 java10 = new Java10();
    java10.varType();
  }
}
