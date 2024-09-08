package Programa;
import java.util.Scanner;
public class NumIngles {
   public static void main(String [] args){
        //declarar variables
        int n;
        String dial="";
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa un numero (1-6) ");
        n=lectura.nextInt();
         //Proceso de datos
         switch (n) {
             case 1: dial="One"; break;
             case 2: dial="Two"; break;
             case 3: dial="Three"; break;
             case 4: dial="Four"; break;
             case 5: dial="five"; break;
             case 6: dial="Six"; break;
             default: dial="Desconocido"; break; 
         }
          System.out.println("El numero escrito es el  : "  + dial);    }}

