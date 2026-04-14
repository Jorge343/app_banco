package org.example;

import java.util.ArrayList;

public class Banco {
    public int sucursal;
    public ArrayList<Cuenta> personas = new ArrayList<>();
    Admin admin = new Admin("Abel", "abel", "123");


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
