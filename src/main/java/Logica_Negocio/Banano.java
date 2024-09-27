/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059237155
 */
public class Banano extends Producto{

    public Banano() {
        super();
    }

    public Banano(int Precio) {
        super(Precio);
    }

    
    
    @Override
    public String InfornmacionProducto() {


        return "El valor del banano es: "+"\t"+this.getPrecio();


    }
    
}
