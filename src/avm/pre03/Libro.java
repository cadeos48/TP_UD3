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
public class Libro {

    /**
     * @param args the command line arguments
     */
    String nombre;
    String autor;
    String descripcion;
    int paginas;

    Libro (String nombre, String autor, String descripcion, int paginas){
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.paginas = paginas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    // El método toString nos permite mostrar la información completa de un objeto, es decir, el valor de sus atributos
    public String toString() {
        return "El libro " + this.nombre + " del autor " + this.autor + " con argumento " 
                +this.descripcion +" tiene " +this.paginas +" páginas";
    } 
}
