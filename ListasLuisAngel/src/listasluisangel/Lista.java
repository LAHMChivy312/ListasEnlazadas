/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasluisangel;

/**
 *
 * @author Alen
 */
public class Lista {
    
private Nodo Principios;
 private Nodo Fin;
  

 public Lista()
 {
  Principios=Fin=null;
 }
  

 public void agregarFin(int info)
 {
   
  Nodo nuevo = new Nodo(info, null);
  
  if(Principios==null)
  {
   Principios=Fin=nuevo;
  }
  else
  {
   Fin.setSiguiente(nuevo);
   Fin = nuevo;
  }
  
 }
  
 public void imprimir()
 {
  Nodo aux=Principios; 
  while(aux!=null)
  {
   System.out.println(aux.getDato());
   aux = aux.getSiguiente();
  } 
}
 public void eliminar(int valor)
 {
  Nodo anterior=Principios;
  Nodo aux= Principios.getSiguiente();
  Nodo temp;
  while(aux!=null)
  {

   if(aux.getDato() > valor)
   {
    temp=aux.getSiguiente();   
    anterior.setSiguiente(aux.getSiguiente()); 
    aux = temp;   
   }
   else
   {
    anterior=anterior.getSiguiente();
    aux=aux.getSiguiente();
   } 
  }
 }
}
