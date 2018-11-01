/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.pre03;

/**
 *
 * @author yo
 */
public class LibroPrincipal {
  public static void main(String[] args) {
      Libro libro1 = new Libro("En el nombre de la rosa", "Umberto Eco", "Intriga", 350);
      System.out.println(libro1.toString());
      libro1.setAutor("Pérez Reverte");
      System.out.println(libro1.toString());
  }  
}

