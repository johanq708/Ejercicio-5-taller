/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Johan Quiñonez
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria c1=new Categoria("categoria 1","Es la categoria_1","abc123");
        c1.crearproducto("producto 1", "Es el primer producto", c1, "def456");
        c1.crearproducto("producto 2", "Es el segundo producto", c1, "def457");
        c1.adicionaritems(0, "item 1", 100, "ghi789");
        c1.adicionaritems(0, "item 2", 200, "ghi790");
        c1.adicionaritems(1, "item 3", 150, "ghi791");
        c1.adicionaritems(1, "item 4", 250, "ghi792");
        System.out.println(c1);
        c1.listarproducto();
        c1.listaritems(0);
        c1.listaritems(1);
    }
    
}
