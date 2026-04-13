package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CuentaBuilder builder = new CuentaBuilder();
        Admin admin = new Admin("Hernesto");

        director.constructCuentaAhorro(builder, "Juan", "Monteagudo 111");
        Cuenta cuenta1 = builder.getCuenta();

        director.constructCuentaCorriente(builder, "Aurelia", "Av. Caseros 222");
        Cuenta cuenta2 = builder.getCuenta();

        admin.modificarSaldo(cuenta1, 3000);
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();

        cuenta1.tranferir(cuenta2, 200);
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();

        admin.habilitarCuenta(cuenta1);
        cuenta1.mostrarInfo();
    }
}