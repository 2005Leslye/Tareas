import java.util.ArrayList;
import java.util.List;
public class Estudiante {
    public String nombreEstudiante;
    public String idEstudiante;
    public List<Curso> cursos;


    public Estudiante(String nombreEstudiante, String idEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.cursos = new ArrayList<>();
    }


    public void añadirCurso(Curso curso) {
        this.cursos.add(curso);
    }


    public void mostrarInformacion() {
        System.out.println("Nombre del estudiante: " + nombreEstudiante);
        System.out.println("ID del estudiante: " + idEstudiante);
        System.out.println("Cursos Inscritos:");
        for (Curso curso : cursos) {
            curso.mostrarInformacionCurso();
            System.out.println();
        }
    }


    public String getNombreEstudiante() {
        return this.nombreEstudiante;
    }

    public String getIdEstudiante() {
        return this.idEstudiante;
    }
}