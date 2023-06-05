package ug.practicas.pruebas;

import java.util.List;
import java.util.Scanner;

import ug.practicas.dominio.Asignatura;
import ug.practicas.dominio.Estudiante;
import ug.practicas.dominio.Matricula;
import ug.practicas.dominio.Univerdad;

public class TestMatricula {

    private static List<Asignatura> Asignatura;
    public static void main(String[] args) {
        
    
    Univerdad univerdad= new Univerdad("Universidad de Guayaquil");
    Estudiante estudiante= new Estudiante(123,"0928975705", " Brando Herrea", "Daule", "Soltero");
    Estudiante estudiante2= new Estudiante(1234,"036365244","Sebastian Peres", "El Empalme-Guayas", "Soltero");
    
    Matricula matri= new Matricula(001);
    matri.AgresarAsignaturas(15478, "Programación Orientada a Objetos", "Ing. Jose Caicedo", "MA-2-1");
    matri.AgresarAsignaturas(15479, "Calculo Integral", "Ing. Mario Figueroa","MA-2-1");
    matri.AgresarAsignaturas(15480, "Estructura de datos", "Cesar Alcivar", "MA-2-1");

        Scanner asignatura=new Scanner(System.in);
        System.out.println("CODIGO DE ASIGNATURAS EN DONDE SE MATRICULADO: 15478 - 15479 - 15480");
        System.out.println();
		System.out.print("Ingrese codigo de la asignatura matriculado:");
		int codigo = asignatura.nextInt();
        Asignatura result = matri.buscarPorCodigo(codigo);
        System.out.println("");
        
        estudiante.mostrarDatos();
       
        //! SE MUENTRAN A TRAVES DEL CODIGO EL CASO ASIGNADO AL DETECTIVE
       System.out.println();
       System.out.println("------------------DATO DE LA ASIGNATURA DONDE SE ENCUENTRA MATRICULADO---------------");
       
       if(result != null) {
           System.out.println("Codigo: "+result.getCodigo()+ "\t\t\tNombre de la asignatura:"+ result.getNombre()+"\n Docente:"+result.getProfesor()+
            "\t Curso:"+result.getCurso());
       }
       else  {
        System.out.println("No existe esta materia");
       }
           
    
     
        
        }

}