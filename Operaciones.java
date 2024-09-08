package Programa;
import java.util.Scanner;
public class Operaciones {
    public static void main(String [] args){
        //declarar variables
        int n1,n2,r,opc;
        r=0;
         Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa Primer Numero : ");
        n1=lectura.nextInt();
         System.out.print("Ingresa Segundo Numero : ");
        n2=lectura.nextInt();
         System.out.print("Ingresa la Operacion : [1 (+); 2 (-); 3 (*) ; 4 (/) ]");
         opc=lectura.nextInt();
         //Proceso de datos
         switch (opc){
             case 1:
                    r=n1+n2;
                    break;
             case 2:
                     r=n1-n2;
                     break;
              case 3:
                     r=n1*n2;
                     break;
             case 4:
                     r=n1/n2;
                     break;
         }
         //salida de datos
         System.out.println("RESULTADO ");
         System.out.println("el resultado de la operacion es  : " + r);
    }
}
