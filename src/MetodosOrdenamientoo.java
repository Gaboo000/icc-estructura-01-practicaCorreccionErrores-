import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: El metodo retorna un arreglo vacio  (return new int []{})
    // Correcion: cambiar el return por return arreglo;
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: La condicion de el If al ser erronea, imprime el arreglo de mayor a menor 
    // Correccion: Cambiar la condicion de el if de  (arreglo[i] < arreglo[j] ) a (arreglo[i] > arreglo[j])

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Hay varios errores en las condiciones dentro de los for, esta mal colocados el indice de los arreglos [i] , [j]
    // el n no deberia ser n-1 ni las j , [j+1] sino solo [j], estan mal colocados los indices de los arreglos en el intercambio de elementos
    // Correccion, cambiar en el primer for i < n , no n-1 , en el segundo for j no es 0 , es i+1, en el if estan dos veces arreglo [j]
    // y el primero hay que cambiar por [i], colocar de manera correcta los indices en el intercambio de elementos 

    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1 ; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: El metodo no retorna nada, por lo cual el metodo va a dar error
    // Correccion: Colocar el return al final de el metodo (return arreglo;)
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }

        return arreglo;

    }

    // Método de selección con errores
    // Error encontrado: En el seguundo for la variable j al final de la condicion deberia ir sumando;
    // Correccion: Cambiar el j-- por j++
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: Al final, estan mal colocados los indices de los arreglo, por lo tanto el arreglo no es ordenado correctamente
    // Correccion: Intercambiar en en smallerNumber el indice de la posicion por indiceMinimo, el mismo caso igualar el arreglo
    // en indiceMinimo a arreglo [i], al dinal igualar el arreglo en la posicion [i] 
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Error en la condicion del bucle while, por lo tanto al ejecudar da un error, y ordena de forma erronea
    // Correccion: Cambiar la condicion, i deberia ser mayor o igual a 0 no mayor , y el arreglo deberia ser mayor a key, no menor.
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: En el primer for, esta colocada la variable que no es, todo lo que es con j en el primer for deberia ir con i
    // y al final de segundo for deberia ser arreglo[ j+1] y no [i+1]
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];

            int j = i - 1; // NOTA: con el ; en el for esta obviando poner el int j= i-1;
            for (; j >= 0 && arreglo[j] > actual; j--) {
                arreglo[j+1] = arreglo[j];
            }
            arreglo[j+1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: la variable i, deberia ser igual a j-1, la condicion de el bucle while es erronea con los simbolos de <>
    // el contador de i en el bucle while deberia restar, y el arreglo deberia retornar arreglo, no un nuevo arreglo creado
    // Correcion: cambian a que i = j - 1, en el bucle while el i deberia ser >=0 y arreglo [i] > key, el i deberia restar entonces
    // seria i -- y no j++, y el return deberia ser return arreglo.
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j -1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
