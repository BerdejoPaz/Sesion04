package Programa;
import java.util.Scanner;
public class Estacion2Anio {
    public static void main(String [] args){
        //declarar variables
        int n;
        String est="";
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa numero del mes : ");
        n=lectura.nextInt();
         //Proceso de datos
         switch (n) {
             case 1: 
             case 2: 
                 est="Verano"; break;
             case 3: 
             case 4: 
             case 5: 
                 est="Otoño"; break;
             case 6: 
             case 7: 
             case 8: 
                 est="Invierno"; break;
             case 9: 
             case 10: 
             case 11: 
                 est="Primavera"; break;
             case 12: 
                 est="Verano"; break;
         }
         //salida de datos
         //System.out.println("RESULTADO ");
         System.out.println("El mes  " + n + " Corresponde a la estacion del año es  : "  + est);
    }
}
