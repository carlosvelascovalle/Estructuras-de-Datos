package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class OrdenacionPorIntercambio {
  /*
   * COMPLEJIDAD
   *  (n" -2n +1)/2
   *  O(n (cuadrado))
   */

  public void intercambiar(int[] a, int i, int j) {
    int aux = a[i];
    a[i] = a[j];
    a[j] = aux;
  }

  public void ordIntercambio(int[] a) {
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
