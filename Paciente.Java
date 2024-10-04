package usuarios.pacientes;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Paciente extends Usuario {

    public String tipoSangre;
    public char sexo;



    public Paciente(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String tipoSangre, char sexo, String telefono, String contraseña) {
        super(id,
                nombre,
                apellidos,
                fechaNacimiento,
                telefono, contraseña,
                Rol.PACIENTE);
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;

    }


    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }


    public String mostrarDatos(){
        String datos = String.format("ID: %s, Nombre: %s, Apellidos: %s, Fecha de Nacimiento: %s, Tipo de Sangre: %s, Sexo: %s, Teléfono: %s", id,nombre, apellidos, fechaNacimiento,tipoSangre,sexo, telefono, tipoSangre,sexo, telefono);
        return datos;
    }
}