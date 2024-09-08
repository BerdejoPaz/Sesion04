package Programa;
import java.util.Scanner;
public class NumRomano {
   public static void main(String [] args){
        int n;    String dial=""; Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa un numero (1-10) ");
        n=lectura.nextInt();
         switch (n) {
             case 1: dial="I"; break;
             case 2: dial="II"; break;
             case 3: dial="III"; break;
             case 4: dial="IV"; break;
             case 5: dial="V"; break;
             case 6: dial="VI"; break;
             case 7: dial="VII"; break;
             case 8: dial="VIII"; break;
             case 9: dial="IX"; break;
             case 10: dial="X"; break;
             default: dial="Desconocido"; break;          }
          System.out.println("El numero escrito es el  : "  + dial);    }}

