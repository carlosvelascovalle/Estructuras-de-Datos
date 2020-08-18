package _6_AlgoritmosOrdenacionYBusqueda;

import java.util.Arrays;

public class OrdenacionPorInserccion {
  public static void main(String[] args) {
    /*
     *  El metodo de ordenacion por insercion es parecido al proceso tipico de ordenar tarjetas de nombres
     *  por orden alfabetico consiste en insertar un nombre en su posicion correcta dentro de una lista
     *  que ya esta ordenada.
     *
     * COMPLEJIDAD
     * O(n cuadrado)
     */
    int[] listado = new int[]{5, 64, 3, 18, 52, 64, 58, 67, 158, 21, 1, 84, 612, 84, 3184, 548, 78, 20, 63, 85, 10};
    Arrays.stream(listado).forEach(valor -> System.out.print(valor + "  "));
    System.out.println();
    ordInserccion(listado);
  }

  public static void ordInserccion(int[] a) {
    int i, j;
    int aux;

    for (i = 0; i < a.length; i++) {
      /* Indice j es para explorar la sublista a[i-1]..a[0] buscando la posicion correcta del elemento destino
       */
    }
  }
}
