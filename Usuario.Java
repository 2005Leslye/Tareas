package usuarios;

import usuarios.utils.Rol;

import java.time.LocalDate;

public class Usuario {
    public String id;
    public String nombre;
    public String apellidos;
    public LocalDate fechaNacimiento;
    public  String telefono;
    private String contraseña;
    public Rol rol;// PACIENTE,ADMIN O MEDICO // enum

    public Usuario(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono,String contraseña, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.contraseña=contraseña;
        this.rol= rol;
    }
    protected String mostrarInformacion(){
        String nombrecompleto= this.nombre + " "+ this.apellidos;
        String datos= String.format("\n Id: %s, Nombre Completo: %s, Fecha de nacimiento: %s, telefono: %s", this.id, nombrecompleto, this.fechaNacimiento, this.telefono);
        return datos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public String getContraseña() {
        return contraseña;
    }
}