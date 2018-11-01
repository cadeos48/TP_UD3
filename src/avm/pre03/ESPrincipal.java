/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.pre03;

/**
 *
 * @author Usuario
 */
public class ESPrincipal {
    public static void main(String[] args) {
        System.out.println(ES.leerCaracter());
        ES.Escribir("pues vale");
        /*  ES.Escribir(ES.leerEntero());
        Esto no sería posible ya que estaría invocando al método estático Escribir
        de la clase ES y le estaría dando como parámetro un método que devuelve un 
        número entero "(ES.leerEntero)" por lo que intentaría almacenar en la variable
        a_escribir del método Escribir un número entero, produciéndose una incompatibilidad
        de tipos ya que a_escribir es de tipo String.
        */
       
    }
}
