public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Algebra", "ALG2089", "Hector Zavala Palencia");
        Curso curso2 = new Curso("Programación", "PROG3089", "Cristopher Arteaga Moreno");
        Curso curso3 = new Curso("Artes", "ART9022", "Liliana Rodríguez Jimenéz");


        Estudiante estudiante1 = new Estudiante("Alan León Huerta", "123432");
        Estudiante estudiante2 = new Estudiante("Ana Griselda Gutierréz Farías", "143546");


        estudiante1.añadirCurso(curso1);
        estudiante1.añadirCurso(curso2);

        estudiante2.añadirCurso(curso2);
        estudiante2.añadirCurso(curso3);

        System.out.println("Información de los estudiantes:");
        System.out.println();
        estudiante1.mostrarInformacion();
        System.out.println();
        estudiante2.mostrarInformacion();
    }
}
