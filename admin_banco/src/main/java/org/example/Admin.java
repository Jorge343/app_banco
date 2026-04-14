package org.example;

public class Admin {
    private String nombre;
    private int dni;

    public Admin(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni
    }

    public void modificarSaldo(Cuenta c, double nuevoSaldo){
        if (c.activo){
            c.saldo = nuevoSaldo;
            System.out.println("Saldo de " + c.nombre + " actualizado a: $" + c.saldo);
        }
        else
            System.out.println("Esta cuenta esta deshabilitada");
    }

    public void cambiarCuenta(Cuenta c){
        if(c.activo){
            c.activo = false;
            System.out.println("Cuenta de " + c.nombre + " deshabilitada.");
        }
        else{
            c.activo = true;
            System.out.println("Cuenta de " + c.nombre + " habilitada.");
        }

    }


}
