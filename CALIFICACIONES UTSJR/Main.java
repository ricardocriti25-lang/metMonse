public class Main {

    public static void main(String[] args) {

        double[] calificaciones = {
            8.5,
            5.5,
            9.0,
            7.5,
            10.0,
            6.0,
            4.5
        };

        // PREGUNTAS Y RESPUESTAS:
        //
        // 1. Mostrar todas las calificaciones.
        // RESPUESTA:
        // 8.5, 5.5, 9.0, 7.5, 10.0, 6.0 y 4.5
        //
        // 2. ¿Cuál es el promedio?
        // RESPUESTA:
        // El promedio es aproximadamente 7.29.
        //
        // 3. ¿Cuántos alumnos están aprobados?
        // RESPUESTA:
        // Hay 5 aprobados.
        //
        // 4. ¿Cuántos alumnos están no aprobados?
        // RESPUESTA:
        // Hay 2 no aprobados.
        //
        // 5. ¿Cuál es la calificación máxima?
        // RESPUESTA:
        // La calificación máxima es 10.0.
        //
        // 6. ¿Cuál es la calificación mínima?
        // RESPUESTA:
        // La calificación mínima es 4.5.

        double suma = 0;
        int aprobados = 0;
        int noAprobados = 0;

        double maxima = calificaciones[0];
        double minima = calificaciones[0];

        System.out.println("CALIFICACIONES:");

        for (int i = 0; i < calificaciones.length; i++) {

            System.out.println(calificaciones[i]);

            suma = suma + calificaciones[i];

            if (calificaciones[i] >= 6.0) {
                aprobados++;
            } else {
                noAprobados++;
            }

            if (calificaciones[i] > maxima) {
                maxima = calificaciones[i];
            }

            if (calificaciones[i] < minima) {
                minima = calificaciones[i];
            }
        }

        double promedio = suma / calificaciones.length;

        System.out.println("\nRESULTADOS:");
        System.out.println("Promedio: " + promedio);
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de no aprobados: " + noAprobados);
        System.out.println("Calificacion maxima: " + maxima);
        System.out.println("Calificacion minima: " + minima);
    }
}