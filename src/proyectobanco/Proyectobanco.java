/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;
import java.util.Scanner;
   
/**
 *
 * @author Usuario
 */
public class Proyectobanco  {
    Scanner input = new Scanner(System.in);
    String opcion;
    Proyectobanco[] arregloCuenta = new Proyectobanco[20];
    private static int id;
 
   private void deposito(double deposito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void retiro(double retiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void depositar(Cuenta cuenta, double cantidad) { //Deposita en la cuenta la cantidad indicada
   cuenta.setSaldo(cuenta.getSaldo() + cantidad); //El saldo que teníamos más la cantidad
}
    public void retirar(Cuenta cuenta, double cantidad) { //Retira en la cuenta la cantidad indicada
   if(cuenta.getSaldo() >= cantidad) { //Si hay dinero suficiente para retirar
      cuenta.setSaldo(cuenta.getSaldo() - cantidad); //El saldo que teníamos menos la cantidad
   }
   else {
      System.out.println("No hay saldo suficiente para retirar esa cantidad."); //Si no hay dinero suficiente notifícalo por pantalla
   }
}
    
    public void menu() {
    int opcion = 0;    
do{    
     





System.out.println("Menu");
System.out.println("1. Depositos");
System.out.println("2. Retiros");
System.out.println("3. Saldo");
System.out.println("4. salir");
System.out.println("selecciona una opcion");
opcion = input.nextInt();
switch(opcion){
    
        
    
case 1:
     System.out.println("Introduzca numero de cuenta: ");
                    id = input.nextInt();
                    System.out.println("Introduzca cantidad a depositar: ");
                    double deposito = input.nextDouble();
                    arregloCuenta[id].deposito(deposito);
                    System.out.println("Depositó a la cuenta: " + deposito + ".\nEl nuevo saldo es de: " + arregloCuenta[id].getSaldo());
                    break;
    
    
case 2:
System.out.println("Introduzca ID de cuenta: ");
                    id = input.nextInt();
                    System.out.println("Introduzca cantidad a retirar: ");
                    double retiro = input.nextDouble();
                    arregloCuenta[id].retiro(retiro);
                    System.out.println("Retiró de la cuenta: " + retiro + ".\nEl nuevo saldo es de: " + arregloCuenta[id].getSaldo());
                    break;
    
case 3:
     System.out.println("Introduzca numero de cuenta: ");
                    id = input.nextInt();
                    System.out.println("Introduzca cantidad a depositar: ");
                    System.out.println(arregloCuenta[id].getSaldo());
                    break;
                    
    

}
 }while(opcion!=4);
}
    }



   
 
