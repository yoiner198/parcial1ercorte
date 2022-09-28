/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Concurso {

    private Participante A;
    private Participante B;
    private Participante C;
    Llanta llanta = new Llanta(2);

    public Concurso(Participante A, Participante B) {
        this.A = A;
        this.B = B;
    }
    
    

    public Concurso(Participante A, Participante B, Participante C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Participante getA() {
        
        return A;
    }

    public Participante getB() {
        return B;
    }

    public Participante getC() {
        return C;
    }

    public void setA(Participante A) {
        this.A = A;
    }

    public void setB(Participante B) {
        this.B = B;
    }

    public void setC(Participante C) {
        this.C = C;
    }
    
    
     
    
}
