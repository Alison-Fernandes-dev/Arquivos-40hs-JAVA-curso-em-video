/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resoluçãodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author 1
 */
public class ResoluçãoDoSistema {
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Sua tela tem resolução " + lar + " x " + alt);
    }  
}
    

