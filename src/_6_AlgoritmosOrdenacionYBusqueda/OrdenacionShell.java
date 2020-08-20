package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class OrdenacionShell {
  /**
   * 1. Se divide la lista original en n/2 grupos de 2, considerando un incremento o salto entre
   * los elementos de n/2.
   * <p>
   * 2. Se clasifica cada grupo por separado, comparando las parejas de elementos, y si no estan
   * ordenados se intercambian.
   * <p>
   * 3. Se divide ahora la lista en la mitad de grupos (n/4), con un incremento o salto entre los
   * elementos tam,bien mitad (n/4), y nuevamente se clasifica cada grupo por separado.
   * <p>
   * 4. Asi sucesivamente, se sigue dividiendo la lista en la mitad de grupos que en el recorrido
   * anterior con un incremento o salto decreciente en la mitad que el salto anterior, y luego
   * clasificando cada grupo por separado.
   * <p>
   * 5. El algoritmo termina cuando se llega a que el tamaño del salto es 1.
   *
   * COMPLEJIDAD
   * O(n e(5/4)).
   */
  public void ordenacionShell(int[] a) {
    int intervalo, j, k;
    int n = a.length;
    intervalo = n / 2;
    while (intervalo > 0) {
      for (int i = intervalo; i < n; i++) {
        j = i - intervalo;
          while (j >= 0) {
            k = j + intervalo;
            if (a[j] <= a[k]) {
              j = -1; //par de elementos ordenados
            } else {
              intercambiar(a, j, j + 1);
              j -= intervalo;
            }
          }
        }
      intervalo = intervalo / 2;
    }
    Arrays.stream(a).forEach(valor -> System.out.print(valor + "  "));

  }

  public void intercambiar(int[] a, int i, int j) {
    int aux = a[i];
    a[i] = a[j];
    a[j] = aux;
  }
}
