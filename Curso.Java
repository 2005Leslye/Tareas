public class Curso {
    public String nombreCurso;
    public String codigoCurso;
    public String instructorCurso;


    public Curso(String nombreCurso, String codigoCurso, String instructorCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructorCurso = instructorCurso;
    }


    public void mostrarInformacionCurso() {
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Código del curso: " + codigoCurso);
        System.out.println("Instructor del curso: " + instructorCurso);
    }


    public String getNombreCurso() {
        return this.nombreCurso;
    }

    public String getCodigoCurso() {
        return this.codigoCurso;
    }

    public String getInstructorCurso() {
        return this.instructorCurso;
    }
}