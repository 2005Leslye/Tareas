package expedientes;

import consultas.Consulta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Expediente {
    public String id;
    public Consulta consultas;
    public String observaciones;
    public LocalDateTime fechaExpediente;

    public Expediente(Consulta consultas, String observaciones) {
        this.consultas = consultas;
        this.id= generarId();
        this.observaciones = observaciones;
        this.fechaExpediente=LocalDateTime.now();
    }

    public String generarId() {
        //E-{año actual}--{mes actual}{longitudpacientes+1}{1,10000}
        Random random = new Random();
        LocalDate fecha = LocalDate.now();

        int anoActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 100001);

        String id = String.format("E%d%d%d", anoActual, mesActual, numeroAleatorio);
        return id;
    }
}