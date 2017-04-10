/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author johit
 */
public class Item extends DomainObject{
    private String nombre;
    private double costo;
    private Producto producto;

    public Item(String nombre, double costo, Producto producto, String id) {
        super(id);
        this.nombre = nombre;
        this.costo = costo;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return " es "+ nombre +", su costo es "+ costo;
    }
    
}
