package Programa;
import java.util.Scanner;
public class PeriodoAnual {
   public static void main(String [] args){
        //declarar variables
        int n;
        String dial="";
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa un numero (1-2-3-4-6-12) ");
        n=lectura.nextInt();
         //Proceso de datos
         switch (n) {
             case 1: dial="Mensual"; break;
             case 2: dial="Bimestral"; break;
             case 3: dial="Trimestral"; break;
             case 4: dial="Cuatrimestral"; break;
             case 6: dial="Semestral"; break;
             case 12: dial="Anual"; break;
             default: dial="Desconocido"; break; 
         }
           System.out.println("El numero escrito es el  : "  + dial);    }}

