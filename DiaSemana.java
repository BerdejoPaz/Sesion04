package Programa;
import java.util.Scanner;
public class DiaSemana {
   public static void main(String [] args){
        //declarar variables
        int n;
        String dial="";
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa numero de dia : ");
        n=lectura.nextInt();
         //Proceso de datos
         switch (n) {
             case 1: dial="Lunes"; break;
             case 2: dial="Martes"; break;
             case 3: dial="Miercoles"; break;
             case 4: dial="Jueves"; break;
             case 5: dial="Viernes"; break;
             case 6: dial="Sabado"; break;
             case 7: dial="Domingo"; break;
         }
         //salida de datos
         //System.out.println("RESULTADO ");
         System.out.println("el dia de la semana es  : "  + dial);
    }
}

