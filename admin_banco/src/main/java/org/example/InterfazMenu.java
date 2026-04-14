package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class InterfazMenu {

    private Scanner sc = new Scanner(System.in);
    Director director = new Director();
    CuentaBuilder builder = new CuentaBuilder();
    Admin admin = new Admin("Hector");

    private ArrayList<Cuenta> listaCuenta = new ArrayList<>();

    public void iniciar(){
        int opcion = 0;
        while(opcion != 5){
            imprimirMenu();
            opcion = sc.nextInt();
            opciones();
        }
    }
    private void imprimirMenu(){
        System.out.println("\\--- APP BANCO ---");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Listar cuentas existentes");
        System.out.println("3. Modificar saldo");
        System.out.println("4. Habilitar/Deshabilitar");
        System.out.println("5. Realizar una transferencia");
        System.out.println("6. Salir");
        System.out.println("Seleccione una opción");
    }

    private void opciones(int opcion){
        switch (opcion){
            case 1:
                System.out.println("Ingrese nombre");
                String nombre = sc.nextLine();
                System.out.println("Ingrese direccion");
                String direc = sc.nextLine();
                System.out.println("Ingrese tipo de cuenta");


        }

    }



}

