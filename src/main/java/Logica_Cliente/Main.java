/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helper.HelperImpresion;
import Logica_Negocio.Banano;
import Logica_Negocio.Naranja;
import Logica_Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author 1059237155
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Producto objbanano = new Banano(500);
        Producto objnaranja = new Naranja(1000);
        ArrayList<Producto> listapro = new ArrayList<>();
        
        listapro.add(objbanano);
        listapro.add(objnaranja);
        HelperImpresion.ImprimirInformacionProducto(listapro);
    }
    
}
