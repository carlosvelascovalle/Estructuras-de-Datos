package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class OrdenacionPorIntercambio {
  public static void main(String[] args) {
    /*
     *  El algoritmo de intercambio ordena los elementos de una
     *  lista en orden ascendente.
     *  El algoritmo se basa en la lectura sucesiva de la lista
     *  a ordenar, comparando el elemento inferior de la lista
     *  con los restantes y efectuando un intercambio de posiciones
     *  cuando el orden resultante de la comparacion no sea el correcto.
     *
     * Complejidad del algoritmo de ordenacion por intercambio
     *  (n" -2n +1)/2
     *  O(n cuadrado)
     */
    int[] listado = new int[]{5, 64, 3, 18, 52, 64, 58, 67, 158, 21, 1, 84, 612, 84, 3184, 548, 78, 20, 63, 85, 10};
    Arrays.stream(listado).forEach(valor -> System.out.print(valor + "  "));
    System.out.println();
    ordIntercambio(listado);
  }

  public static void intercambiar(int[] a, int i, int j) {
    int aux = a[i];
    a[i] = a[j];
    a[j] = aux;
  }

  public static void ordIntercambio(int[] a) {
    int i, j;
    for (i = 0; i < a.length - 1; i++) {
      // situa minimo de a[i+1]...a[n-1] en a[i]
      for (j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          intercambiar(a, i, j);
        }
      }
    }
    Arrays.stream(a).forEach(valor -> System.out.print(valor + "  "));

  }
}
