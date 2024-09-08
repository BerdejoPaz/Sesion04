package Programa;
import java.util.Scanner;
public class NomLetra {
   public static void main(String [] args){
        //declarar variables
        int n;
        String dial="";
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa un numero (1-5) ");
        n=lectura.nextInt();
         //Proceso de datos
         switch (n) {
             case 1: dial="Uno"; break;
             case 2: dial="Dos"; break;
             case 3: dial="Tres"; break;
             case 4: dial="Cuatro"; break;
             case 5: dial="Cinco"; break;
             default: dial="Desconocido"; break;         }
         //salida de datos
         //System.out.println("RESULTADO ");
         System.out.println("El numero escrito es el  : "  + dial);   }}

