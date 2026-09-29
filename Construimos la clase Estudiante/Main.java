class Estudiante {

    String matricula;
    String nombre;
    double promedio;
    int cuatrimestre;

    Estudiante(String mat, String nom, double prom, int cua) {
        matricula = mat;
        nombre = nom;
        promedio = prom;
        cuatrimestre = cua;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + promedio);
        System.out.println("Cuatrimestre: " + cuatrimestre);
        System.out.println("----------------");
    }
}

public class Main {

    public static void main(String[] args) {

        double[] promedios = {9.3, 8.4, 9.0};
        System.out.println("Promedio inicial: " + promedios[0]);

        Estudiante[] grupo = new Estudiante[3];

        grupo[0] = new Estudiante("D101", "Mario", 9.3, 4);
        grupo[1] = new Estudiante("D102", "Fernanda", 8.4, 4);
        grupo[2] = new Estudiante("D103", "Alex", 9.0, 4);

        System.out.println("\nDato del segundo estudiante:");
        System.out.println(grupo[1].nombre);
        System.out.println(grupo[1].promedio);

        System.out.println("\nInformacion del grupo:");

        for (int x = 0; x < grupo.length; x++) {
            grupo[x].mostrarInformacion();
        }
    }
}