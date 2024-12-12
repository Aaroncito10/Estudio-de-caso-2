/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiocaso2;

import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Habitaciones {

    //Entrada de datos para las habitaciones
    Scanner scanner = new Scanner(System.in);

    //Variables donde se guardara la informacion necesaria
    private Estados estadoHabitacion;
    private double gananciasActuales;
    private int numeroDeHabitacion;
    private int precioPorNoche;

    //Matriz donde se almacenaran las habitaciones 
    public Habitaciones habitacionesHotel[][];

    //Constructor de la clase Habitaciones
    public Habitaciones( enum estadoHabitacion, int numeroDeHabitacion, int precioPorNoche) {
        this.estadoHabitacion = estadoHabitacion;
        this.gananciasActuales = gananciasActuales;
        this.precioPorNoche = precioPorNoche;
        this.numeroDeHabitacion = numeroDeHabitacion;

    }

    //Metodos setters y getters
    public double getGananciasActuales() {
        return gananciasActuales;
    }

    public void setGananciasActuales(double gananciasActuales) {
        this.gananciasActuales = gananciasActuales;
    }

    
    //Metodo para solicitar datos sobre los pisos del hotel y de las habitaciones del mismo
    public void solicitarDatosParaLasHabitaciones() {
        System.out.println("Ingrese por favor la cantidad de pisos que desea para su hotel : ");

    }

    //Estados de las habitaciones
    public enum Estados {
        Disponible,
        Ocupado,
        En_Limpieza

    }

    //Precarga de los estados de las habitaciones 
    public void infoPrecargadaHabitaciones() {
        this.Habitaciones = new Habitaciones[][]{
            new Habitaciones("Disponible", "5", "70.000"),
            new Habitaciones("Ocupada", "8", "140.000"),
            new Habitaciones("En_Limpieza", "30", "100.000")
        };

    }

}
