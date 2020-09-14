package proyectobanco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel Zapata
 */
public class Cuenta {
    
    private String tipoCuenta;
    private String titular;
    private double saldo;

    public Cuenta(String tipoCuenta, String titular, double saldo) {
        this.tipoCuenta = tipoCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
   
    public String getTipoCuenta() {
        return tipoCuenta;
    }
   
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTipoCuenta(String tipo) {
        this.tipoCuenta = tipo;
    }
//Consulta cuánto saldo tenemos, el valor NO se modifica
    public double getSaldo() {
        return saldo;
    }
//Servirá tanto para depositar como para retirar saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
       
    public void retiro(double monto) {
        this.saldo = saldo - monto;
    }
   
    public void deposito(double monto) {
        this.saldo = saldo + monto;
    }   
}
    

