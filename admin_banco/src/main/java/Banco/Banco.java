package org.example;

import java.util.ArrayList;

public class Banco {
    public int sucursal;
    public ArrayList<Cuenta> personas = new ArrayList<>();
    Director director = new Director();
    CuentaBuilder builder = new CuentaBuilder();


    public Banco (int sucursal){
        this.sucursal = sucursal;
        //personas.add(admin1);
        director.constructCuentaAdmin(builder, "aa", "aa");
        Cuenta admin = builder.getCuenta();
        personas.add(admin);
    }

    public void añadirCuenta(Cuenta c){
        personas.add(c);
        System.out.println("Usuario " + c.nombre + " registrado exitosamente");
    }

    public void mostrarBalance(){
        double saldoPersona;
        double saldoTotal = 0;

        if (personas.size()<=1){
            System.out.println("No hay usuarios registrados");
        }
        else{
            for (int i = 0; i < personas.size(); i++) {
                saldoPersona = personas.get(i).saldo;
                saldoTotal += saldoPersona;
            }
            System.out.println("El balance total de la sucursal es de: $" + saldoTotal);
        }
    }
}
