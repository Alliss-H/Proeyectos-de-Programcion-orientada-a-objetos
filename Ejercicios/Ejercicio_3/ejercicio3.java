package Ejercicio_3;

public class ejercicio3 
{
    //todo Declaracion de constantes
    static float CUOTA = 0.08f;
    static String EMPRESA = "ELECTRONICS S.A.";
    static String PROCESO = "VENTA TV LED";
    static String LINEA= "=================================================";

    public static void main (String[] args)
    {
        //todo Declaracion de valores de ingreso
        String codigoCliente= " 0958801482";
        String cliente= " Allisson";
        byte totalCuotas=12;
        String cuotaInicial= "8%";
        double precio=510;
        double cuotaEntrada=precio*CUOTA;
        double cuotaMensual=(precio-cuotaEntrada)/12;
        
        //todo Muestra en consola
        System.out.println("\t \t "+EMPRESA);
        System.out.println("\t \t "+PROCESO);
        System.out.println(LINEA);

        System.out.println("CODIGO:" + codigoCliente);
        System.out.println("CLIENTE:" + cliente);
        System.out.println(LINEA);

        System.out.println("PRECIO:" + precio);
        System.out.printf("CUOTA DE ENTRADA:%.2f \t    ENTRADA:%s \n" ,cuotaEntrada,cuotaInicial);
        System.out.printf("CUOTA MENSUAL:%.2f \t    #CUOTAS:%s \n ",cuotaMensual,totalCuotas);
        System.out.println(LINEA);
    }
}