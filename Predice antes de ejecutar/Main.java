public class Main {

    public static void main(String[] args) {

        int[] numeros = {
            5,
            8,
            2,
            10,
            4
        };

        int contador = 0;

        // PREGUNTA:
        // ¿Cuál será el valor final de contador?
        //
        // RESPUESTA:
        // El valor final de contador será 2.
        //
        // ¿POR QUÉ?
        // Porque el programa recorre todos los números del arreglo
        // y solamente aumenta el contador cuando encuentra
        // un número mayor que 5.
        //
        // 5 > 5  = No
        // 8 > 5  = Sí
        // 2 > 5  = No
        // 10 > 5 = Sí
        // 4 > 5  = No
        //
        // Por lo tanto, hay 2 números mayores que 5.

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 5) {
                contador++;
            }
        }

        System.out.println("El valor final del contador es: " + contador);
    }
}