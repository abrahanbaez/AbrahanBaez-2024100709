
package com.unida.tarea9_polimorfismo;

public class Tarea9_Polimorfismo {

    public static void main(String[] args) {

        Empleado[] nomina = new Empleado[2];

        nomina[0] = new EmpleadoFijo("Carlos Gomez", 3500000);
        nomina[1] = new EmpleadoPorHora("Maria Lopez", 40, 50000);

        for (Empleado e : nomina) {
            System.out.println(e.getNombre() + " -> Sueldo: Gs. " + e.calcularSueldo());
        }
    }
}
