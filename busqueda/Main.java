public class Main {

    public static void main(String[] args) {

        int[] folios = {
            101,
            105,
            110,
            115,
            120
        };

        int folioBuscado = 110;
        boolean encontrado = false;

        // PREGUNTA:
        // ¿Existe el folio 110?
        //
        // RESPUESTA:
        // Sí, el folio 110 sí existe.
        //
        // ¿POR QUÉ?
        // Porque el programa recorre los folios uno por uno.
        // Cuando encuentra el número 110, cambia
        // la variable "encontrado" de false a true.
        //
        // 101 == 110 -> No
        // 105 == 110 -> No
        // 110 == 110 -> Sí

        for (int i = 0; i < folios.length; i++) {

            if (folios[i] == folioBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Si existe el folio " + folioBuscado);
        } else {
            System.out.println("No existe el folio " + folioBuscado);
        }
    }
}