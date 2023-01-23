package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
        LectorDePersonas lectorDePersonas = new LectorDePersonas();
        ArrayList<Persona> personas = lectorDePersonas.leerPersonas();
        int cantidadMayoresEdad = 0;
        int cantidadMenoresEdad = 0;
        int cantidadMasculinaMayoresEdad = 0;
        int cantidadFemeninaMenoresEdad = 0;
        double porcentageMayoresEdad = 0;
        double porcentageMenoresEdad = 0;

        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                cantidadMayoresEdad++;
            }
        }
        System.out.println(cantidadMayoresEdad + " mayores de edad.");

        for (Persona persona : personas) {
            if (persona.getEdad() < 18) {
                cantidadMenoresEdad++;
            }
        }
        System.out.println(cantidadMenoresEdad + " menores de edad.");

        for (Persona persona : personas) {
            if (persona.getEdad() >= 18 && persona.getSexo().equals("Masculino")) {
                cantidadMasculinaMayoresEdad++;
            }
        }
        System.out.println(cantidadMasculinaMayoresEdad + " hombres mayores de edad.");

        for (Persona persona : personas) {
            if (persona.getEdad() < 18 && persona.getSexo().equals("Femenino")) {
                cantidadFemeninaMenoresEdad++;
            }
        }
        System.out.println(cantidadFemeninaMenoresEdad + " mujeres menores de edad.");

        porcentageMayoresEdad = (cantidadMayoresEdad * 100) / personas.size();
        porcentageMenoresEdad = (cantidadMenoresEdad * 100) / personas.size();;

        System.out.println(porcentageMayoresEdad + " mayores de edad.");
        System.out.println(porcentageMenoresEdad + " menores de edad.");
    }
}
