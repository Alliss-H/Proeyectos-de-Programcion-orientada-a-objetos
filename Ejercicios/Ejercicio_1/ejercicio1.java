package Ejercicio_1;

public class ejercicio1 
{
      //todo Declaramos las constantes
      static String EMPRESA = "SOLUTIONS S.A.";
      static float DESCUENTO_PAGO = 0.0945f;
      static String PROCESO = "ROL DE PAGO";
      static String LINEA= "======================================================";

      public static void main (String[] args)
      {
          //todo Declaracion de valores de ingreso
          String mes= "Marzo" ;
          String empleado= "Allisson Huilca";
          byte edad= 21;
          double sueldo=495;
          String porcentaje= "9.45%";
          double seguroSocial=sueldo*DESCUENTO_PAGO;
          double valorRecibir=sueldo-seguroSocial; 

          //todo Muestra en consola
          System.out.println("\t \t" +EMPRESA);
          System.out.println("\t \t" +PROCESO);
          System.out.println(LINEA);

          System.out.println("MES: " + mes);
          System.out.printf("EMPLEADO: %s  \t  EDAD:  %s \n " , empleado, edad);
          System.out.println(LINEA);

          System.out.println("SUELDO:"+sueldo );
          System.out.printf("APORTE SEGURO: %.2f \t          APORTE: %s \n ",seguroSocial,porcentaje);
          System.out.printf("VALOR A RECIBIR: %.2f \n ",valorRecibir);

          System.out.println(LINEA);
          System.out.println(LINEA); //pendiente esta LINEA
    }
}