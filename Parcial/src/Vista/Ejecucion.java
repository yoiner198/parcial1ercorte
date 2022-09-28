/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Concurso;
import Modelo.Llanta;
import Modelo.Participante;

/**
 *
 * @author ESTUDIANTE
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Participante A = new Participante("Luis","Perez",1,new Llanta(10));
        Participante B = new Participante("Isis","Parra",1,new Llanta(15));
        Participante C = new Participante("Jean","Mesa",1,new Llanta(5));
        
        Concurso concurso = new Concurso(A,B);
        concurso.setC(C);
        
        System.out.println("Resultado de lanzamientos");
        System.out.println("-------------------------");
        
        
      
    }
}