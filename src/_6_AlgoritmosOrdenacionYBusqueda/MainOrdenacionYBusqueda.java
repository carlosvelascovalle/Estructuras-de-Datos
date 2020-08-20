package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class MainOrdenacionYBusqueda {
  public static void main(String[] args) {
    QuickSort ordenar = new QuickSort();
    int[] listado = new int[]{5, 64, 3, 18, 52, 64, 58, 67, 158, 21, 1, 84, 612, 84, 3184, 548, 78, 20, 63, 85, 10};
    Arrays.stream(listado).forEach(valor -> System.out.print(valor + "  "));
    System.out.println();
    ordenar.quicksort(listado,0, listado.length-1);
    Arrays.stream(listado).forEach(valor -> System.out.print(valor + "  "));

  }
}
