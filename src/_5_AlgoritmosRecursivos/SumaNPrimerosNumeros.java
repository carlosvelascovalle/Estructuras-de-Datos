package _5_AlgoritmosRecursivos;

public class SumaNPrimerosNumeros {
  public static void main(String[] args) {
    System.out.println(sumaNenteros(40));
  }

  public static long sumaNenteros(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + sumaNenteros(n - 1);
    }
  }
}
