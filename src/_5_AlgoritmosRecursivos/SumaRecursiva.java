package _5_AlgoritmosRecursivos;

public class SumaRecursiva {
  public static void main(String[] args) {
    System.out.println(sumaRecursiva(5190));
  }

  public static int sumaRecursiva(int n) {
    if (n <= 9) {
      return n;
    } else {
      return sumaRecursiva(n / 10) + n % 10;
    }
  }
}
