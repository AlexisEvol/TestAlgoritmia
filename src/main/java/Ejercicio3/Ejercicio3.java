package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        LeerInformacion leerInformacion = new LeerInformacion();
        System.out.println("Escriba el precio hora");
        Scanner scanner = new Scanner(System.in);
        final int tarifa = scanner.nextInt();
        System.out.println("Escriba las horas trabajadas");
        final int horasTrabajadas = scanner.nextInt();
        scanner.close();

        int horasExtra = leerInformacion.getHorasExtra(horasTrabajadas);
        double sueldoFinal = leerInformacion.getPrecioFinal(horasTrabajadas, horasExtra, tarifa);
        System.out.println("El sueldo mensual es: " + sueldoFinal + " con un total de " + horasExtra + " horas extras trabajadas.");
        System.out.println("Anualmente ganaría " + sueldoFinal*12);

    }
}
