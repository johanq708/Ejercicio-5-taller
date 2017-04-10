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
public class Cliente extends DomainObject{
    private String nombre;
    private String apellido;
    private String telefono;
    private String calle;
    private String carrera;
    private String ciudad;
    private String zipcode;
    private String pais;

    public Cliente(String nombre, String apellido, String id) {
        super(id);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.calle = calle;
        this.carrera = carrera;
        this.ciudad = ciudad;
        this.zipcode = zipcode;
        this.pais = pais;
    }
    
}
