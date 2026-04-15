package org.example;

enum Rol {
    ADMIN, CLIENTE
}
public class Cuenta {


    public String nombre;
    public String direccion;
    public String tipoCuenta;
    public String password;
    public double saldo;
    public boolean activo = true;
    public Rol rol;

    public void mostrarInfo(){
        if(activo)
            System.out.println("Nombre: " + nombre + " Direccion-: " + direccion + " Cuenta: " + tipoCuenta + " Saldo: $" + saldo);
        else
            System.out.println("Esta cuenta no se encuentra activa");
    }

    public void tranferir(Cuenta c, int monto){
        if (this.activo && c.activo && this.saldo >=monto ){
            this.saldo -= monto;
            c.saldo += monto;
            System.out.println("Se realizo la transferencia correctamente, saldo actual: $" + this.saldo);
        }
        else
            System.out.println("Saldo insuficiente para realizar esta operación o cuenta inactiva");
    }


}
interface Builder{
    void reset();
    void setNombre(String nombre);
    void setDireccion(String direccion);
    void setTipo (String tipo);
    void setRol (Rol rol);
    void setPass (String pass);
}

class CuentaBuilder implements Builder {
    private  Cuenta cuenta;

    public CuentaBuilder(){
        this.reset();
    }
    public void reset(){
        this.cuenta = new Cuenta();
    }
    public void setNombre (String nombre){
        this.cuenta.nombre = nombre;
    }
    public void setDireccion (String direccion){
        this.cuenta.direccion = direccion;
    }
    public void setTipo (String tipo){
        this.cuenta.tipoCuenta = tipo;
    }
    public void setRol (Rol rol){
        this.cuenta.rol = rol;
    }
    public void setPass (String pass){
        this.cuenta.password = pass;
    }
    public Cuenta getCuenta(){
        Cuenta cuenta = this.cuenta;
        this.reset();
        return cuenta;
    }
}



