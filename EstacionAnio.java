package Programa;
import java.util.Scanner;
public class EstacionAnio {
    public static void main(String [] args){
        //declarar variables
        int n;
        String estacion="";
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa numero de estacion : ");
        n=lectura.nextInt();
         //Proceso de datos
         switch (n) {
             case 1: estacion="Primavera"; break;
             case 2: estacion="Verano"; break;
             case 3: estacion="Otoño"; break;
             case 4: estacion="Invienno"; break;
             
         }
         //salida de datos
         //System.out.println("RESULTADO ");
         System.out.println("el dia de la semana es  : "  + estacion);
    }
}
