/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Logica_Negocio.Banano;
import Logica_Negocio.Naranja;
import Logica_Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author 1059237155
 */
public class HelperImpresion {
    public static void ImprimirInformacionProducto(ArrayList<Producto> listaprodutos)
    {
        for (int i = 0; i < listaprodutos.size(); i++) {
          
            if (listaprodutos.get(i)instanceof Naranja) {
                System.out.println(listaprodutos.get(i).InfornmacionProducto());
            }
            if (listaprodutos.get(i)instanceof Banano) {
                System.out.println(listaprodutos.get(i).InfornmacionProducto());            }
        }
    }
}
