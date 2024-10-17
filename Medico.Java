package usuarios.medicos;
import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Medico extends Usuario {

    private  String rfc;

    public Medico(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String rfc,String contraseña) {
       super(id, nombre, apellidos, fechaNacimiento, telefono,contraseña,Rol.MEDICO);
       this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public String mostrarDatos(){
        String datos = String.format("ID: %s, Nombre: %s, Apellidos: %s, Fecha de Nacimiento: %s, Teléfono: %s, RFC: %s", id, nombre, apellidos, fechaNacimiento, telefono, telefono, rfc);
        return datos;
    }
}