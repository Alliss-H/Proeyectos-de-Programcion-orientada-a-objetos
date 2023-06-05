package Ejercicio_2;

public class ejercicio2 
{
    //todo Declaramos las constantes
    static String EMPRESA = "EL CAMBIO.COM";
    static float CAMBIO_DIVISA = 8.0f;
    static String PROCESO = "CAMBIO DE DIVISA";
    static String LINEA= "===================================================";

    public static void main (String[] args)
    {
        //todo Declaracion de valores de ingreso

        String cedula= "0985859624"; 
        String cliente= "Allisson Dayanna";
        String equivale= "0.95";
        double valorDolar=510;
        double valorEuros=valorDolar*CAMBIO_DIVISA;

        //todo Muestra en la consola
        System.out.println("\t \t" +EMPRESA );
        System.out.println("\t \t" +PROCESO);
        System.out.println(LINEA);

        System.out.println("Cedula: " + cedula);
        System.out.println("Cliente: " + cliente);
        System.out.println(LINEA);

        System.out.printf("VALOR EN DOLARES:%.2f \t    CAMBIO:%s \n ",valorDolar,equivale);
        System.out.printf("VALOR A ENTREGAR EN EUROS:%.2f \n ",valorEuros);
        System.out.println(LINEA);
    }
}