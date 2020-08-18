package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class OrdenacionPorSeleccion {
  public static void main(String[] args) {
    /*
     *  El algoritmo se apoya en las pasadas que intercambian el elemento mas pequeño, sucesivamente con el elemento
     *  de la lista que ocupa la posición igual al orden de pasada. La pasada inicial busca el elemento más pequeño
     *  de la lista y le intercambia con a[0] y asi sucesivamente.
     *
     *  COMPLEJIDAD DEL ALGORITMO DE SELECCIÓN
     *  O(n cuadrado)
     */
    int[] listado = new int[]{5, 64, 3, 18, 52, 64, 58, 67, 158, 21, 1, 84, 612, 84, 3184, 548, 78, 20, 63, 85, 10};
    Arrays.stream(listado).forEach(valor -> System.out.print(valor + "  "));
    System.out.println();
    ordSeleccion(listado);
  }

  public static void ordSeleccion(int a[]) {
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

  public static void intercambiar(int[] a, int i, int j) {
    int aux = a[i];
    a[i] = a[j];
    a[j] = aux;
  }
}
