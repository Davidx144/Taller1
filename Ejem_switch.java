//Ejem_switch

import java.util.Scanner;
public class Ejem_switch {
public static void main(String args[]) {

 Scanner in = new Scanner(System.in);

 System.out.println("Por favor ingrese un n�mero entero: ");
 int numeroLeido = in.nextInt();
 Boolean x;
 if(numeroLeido % 2 == 0){
	 x=true;
 }
 
 switch (numeroLeido)
{
case (numeroLeido % 2 == 0):
 System.out.println("El n�mero " + numeroLeido + " es par");
 break;
 
case (numeroLeido % 2 != 0):
 System.out.println("El n�mero " + numeroLeido + " es impar");
 break;
}
}
}