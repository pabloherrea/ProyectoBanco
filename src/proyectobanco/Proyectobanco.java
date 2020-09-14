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
public class Proyectobanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

int opcion=0;


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
    System.out.println("opcion 1");
break;
    
    
case 2:
System.out.println("opcion 2");
break;
    
    
case 3:
    System.out.println("opcion 3");
break;
    

}
 }while(opcion!=4);
 }
 }
