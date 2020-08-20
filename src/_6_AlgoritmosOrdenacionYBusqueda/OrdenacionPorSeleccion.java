package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class OrdenacionPorSeleccion {
    /*
     *  COMPLEJIDAD
     *  O(n (cuadrado))
     */
  public void ordSeleccion(int a[]) {
    int indiceMenor, i, j, n;
    n = a.length;
    for (i = 0; i < n - 1; i++) {
      //  comienzo de la exploración en indice i
      indiceMenor = i;
      //  j explora la sublista a[i+1]..a[n-1]
      for (j = i + 1; j < n; j++) {
        if (a[j] < a[indiceMenor]) {
          indiceMenor = j;
        }
      }
      // situa el elemento mas pequeño en a[i]
      if (i != indiceMenor) {
        intercambiar(a, i, indiceMenor);
      }
    }
    Arrays.stream(a).forEach(valor -> System.out.print(valor + "  "));
  }

  public void intercambiar(int[] a, int i, int j) {
    int aux = a[i];
    a[i] = a[j];
    a[j] = aux;
  }
}
