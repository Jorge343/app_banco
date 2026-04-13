package org.example;

public class Director {
    public void constructCuentaAhorro(Builder builder, String nombre, String direccion){
        builder.reset();
        builder.setNombre(nombre);
        builder.setDireccion(direccion);
        builder.setTipo("Ahorro");
    }
    public void constructCuentaCorriente(Builder builder, String nombre, String direccion){
        builder.reset();
        builder.setNombre(nombre);
        builder.setDireccion(direccion);
        builder.setTipo("Corriente");
    }

}
