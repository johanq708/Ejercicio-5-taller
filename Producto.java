/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.ArrayList;
/**
 *
 * @author Johan Quiñonez
 */
public class Producto extends DomainObject{
    private String nombre;
    private String descipcion;
    private Categoria categoria;
    private ArrayList<Item> items;

    public Producto(String nombre, String descipcion, Categoria categoria, String id) {
        super(id);
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.categoria = categoria;
        this.items = new ArrayList<>();
    }
    public void crearitem(String n,double c,Producto p,String id){
        Item i=new Item(n,c,p,id);
        items.add(i);
    }
    public void listaritem(){
        for(int i=0;i<items.size();i++){
            System.out.println("el item numero "+(i+1)+items.get(i));
        }
    }

    @Override
    public String toString() {
        return "El producto es " + nombre + ", " + descipcion + ", pertenece a " + categoria+", tiene "+items.size()+" items.";
    }
    
}
