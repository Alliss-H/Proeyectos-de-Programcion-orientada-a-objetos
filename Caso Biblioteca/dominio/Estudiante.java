package ug.practicas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    private int codigo;
    private List<Matricula> listaMatriculas;

    public Estudiante(int codigo,String cedula, String nombre, String direccion, String estadoCivil) {
        super(cedula, nombre, direccion, estadoCivil);
        this.codigo = codigo;
        listaMatriculas = new ArrayList<Matricula>();
    }
    

  

    
 
    public void mostrarDatos(){
        System.out.println("-----------------------DATOS DEL ESTUDIANTE---------------------");
        System.out.println("Codigo:"+codigo+"\t\t Cedula:"+cedula);
        System.out.println("Nombre:"+nombre+"\t Estado civil:"+estadoCivil);
        System.out.println("Direccion:"+direccion);
    }
    
}