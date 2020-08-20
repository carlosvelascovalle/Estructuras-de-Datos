package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class OrdenacionPorInserccion {
  /*
   * COMPLEJIDAD
   * O(n cuadrado)
   */
  public void ordInserccion(int[] a) {
    int i, j;
    int aux;

    for (i = 0; i < a.length; i++) {
      //Indice j es para explorar la sublista a[i-1]..a[0] buscando la posicion correcta del elemento destino
      j = i;
      aux = a[i];
      // se localiza el punto de inserción explorando hacia abajo
      while (j > 0 && aux < a[j - 1]) {
        //desplazar elementos hacia arriba para hacer espacio
        a[j] = a[j - 1];
        j--;
      }
      a[j] = aux;
    }
    Arrays.stream(a).forEach(valor -> System.out.print(valor + "  "));

  }
}
