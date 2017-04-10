/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.ArrayList;
/**
 *
 * @author johit
 */
public class Categoria extends DomainObject{
    private String nombre;
    private String descipcion;
    private ArrayList<Producto> productos;

    public Categoria(String nombre, String descipcion, String id) {
        super(id);
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.productos = new ArrayList<>();
    }
    
    public void crearproducto(String n,String d,Categoria c,String id){
        Producto p=new Producto(n,d,c,id);
        productos.add(p);
    }
    public void adicionaritems(int i,String n,double c,String id){
        productos.get(i).crearitem(n, c, productos.get(i), id);
    }
    public void listarproducto(){
        for(int i=0;i<productos.size();i++){
            System.out.println(productos.get(i));
        }
    }
    public void listaritems(int i){
        System.out.println("Items del producto "+(i+1)+":");
        productos.get(i).listaritem();
    }

    @Override
    public String toString() {
        return "Categoria: " + nombre ;
    }
    
}
