/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treestring;

/**
 *
 * @author ASUS
 */
public class NodoCadena {
   private String dato;
    private NodoCadena izquierda, derecha;

    public NodoCadena(String dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }


    public String getDato() {
        return dato;
    }

    public NodoCadena getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoCadena izquierda) {
        this.izquierda = izquierda;
    }

    public NodoCadena getDerecha() {
        return derecha;
    }

    @Override
    public String toString() {
        return "NodoCadena{" + "dato=" + dato + ", izquierda=" + izquierda + ", derecha=" + derecha + '}';
    }

    public void setDerecha(NodoCadena derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    } 
    
}
