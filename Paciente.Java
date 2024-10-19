package usuarios.pacientes;

import expedientes.Expediente;
import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Usuario {

    public String tipoSangre;
    public char sexo;
    public ArrayList <Expediente> expedientes;



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
        String datos = String.format("ID: %s, Nombre: %s, Apellidos: %s, Fecha de Nacimiento: %s, Tipo de Sangre: %s, Sexo: %s, Teléfono: %s", id,nombre, apellidos,fechaNacimiento,tipoSangre,sexo, telefono, tipoSangre,sexo, telefono);
        return datos;
    }
    public void registrarExpediente(Expediente expediente){
        this.expedientes.add(expediente);
    }
}