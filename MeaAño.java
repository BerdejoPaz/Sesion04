package Programa;
import java.util.Scanner;
public class MeaAño {
 public static void main(String [] args){
        //declarar variables
        int n;
        String mesl="";
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa numero del mes : ");
        n=lectura.nextInt();
         //Proceso de datos
         switch (n) {
             case 1: mesl="enero"; break;
             case 2: mesl="febrero"; break;
             case 3: mesl="marzo"; break;
             case 4: mesl="abril"; break;
             case 5: mesl="mayo"; break;
             case 6: mesl="junio"; break;
             case 7: mesl="julio"; break;
             case 8: mesl="agosto"; break;
             case 9: mesl="setiembre"; break;
             case 10: mesl="octubre"; break;
             case 11: mesl="noviembre"; break;
             case 12: mesl="diciembre"; break;
         }
         //salida de datos
         //System.out.println("RESULTADO ");
         System.out.println("El nombre del mes es   : "  + mesl);
    }
}