package _5_AlgoritmosRecursivos;

public class Alfabeto {
  public static void main(String[] args) {
    System.out.println();
    metodoA('Z');
    System.out.println();
  }

  public static void metodoA(char c) {
    if (c > 'A') {
      metodoB(c);
      System.out.println(c);
    }
    else {
      System.out.println('A');
    }
  }

  public static void metodoB(char c) {
    metodoA(--c);
  }
}
