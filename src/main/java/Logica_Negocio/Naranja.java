/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059237155
 */
public class Naranja extends Producto{

    public Naranja() {
        super();
    }

    public Naranja(int Precio) {
        super(Precio);
    }

    
    
    @Override
    public String InfornmacionProducto() {


        return "El valor de la naranja es: "+"\t"+this.getPrecio();


    }
    
}
