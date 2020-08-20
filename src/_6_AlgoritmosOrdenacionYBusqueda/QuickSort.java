package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class QuickSort {
  /**
   * COMPLEJIDAD
   * O(n * log(n))
   */
  public void quicksort(int a[], int primero, int ultimo) {
    int i, j, central;
    int pivote;
    central = (primero + ultimo) / 2;
    pivote = a[central];
    i = primero;
    j = ultimo;
    do {
      while (a[i] < pivote) {
        i++;
      }
      while (a[j] > pivote) {
        j--;
      }
      if (i <= j) {
        intercambiar(a, i, j);
        i++;
        j--;
      }
    } while (i <= j);
    if (primero < j) {
      quicksort(a, primero, j);
    }
    if (i < ultimo) {
      quicksort(a, i, ultimo);
    }

  }

  public void intercambiar(int[] a, int i, int j) {
    int aux = a[i];
    a[i] = a[j];
    a[j] = aux;
  }
}
