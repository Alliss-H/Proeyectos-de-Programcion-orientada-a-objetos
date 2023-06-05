package Ejercicio_4;

public class ejercicio4 
{
    //todo Declaracion de constantes
    static float Pi = 3.1416f;
    static String EMPRESA = "AREA Y PERIMETRO DE UN CÍRCULO";
    static String LINEA= "===================================================";

    public static void main (String[] args)
    {
        //todo Declaracion valores de ingreso
        double radio=18;
        double area=Pi*Math.pow(radio,2);
        double perimetro=2*Pi*radio;

        //todo Muestra en la consola
        System.out.println("\t"+EMPRESA);

        System.out.println(LINEA);

        System.out.printf("RADIO:%s\t    PI:%s \n ",radio,Pi);

        System.out.println(LINEA);

        System.out.printf("AREA:%.2f \t    PERIMETRO:%.2f \n ",area,perimetro);

        System.out.println(LINEA);
    }
} 