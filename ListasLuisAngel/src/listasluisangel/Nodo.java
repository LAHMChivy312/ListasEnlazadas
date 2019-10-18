/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasluisangel;


public class Nodo {
 private int D;
    private Nodo next;

    public Nodo(int dato, Nodo siguiente) {
        this.D = dato;

        this.next = siguiente;
    }

    public Nodo(int datos) {
        this.D = datos;
        this.next = null;
    }

    public int getDato() {
        return D;
    }

    public void setDato(int dato) {
        this.D = dato;
    }

    public Nodo getSiguiente() {
        return next;
    }

    public void setSiguiente(Nodo siguiente) {
        this.next = siguiente;
    }
}

