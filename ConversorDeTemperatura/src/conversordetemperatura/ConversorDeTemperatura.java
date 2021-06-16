/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordetemperatura;

import java.util.Scanner;

/**
 *
 * @author 1
 */
public class ConversorDeTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code aimport java.util.Scanner

    Scanner sc = new Scanner(System.in);
    int cels;

    public ConversorDeTemperatura() {
        System.out.println("Entre com a temperatura Celsius: ");
        setCels(sc.nextInt());
        System.out.println("A Temperatura convvertida é de: " + getCels());
    }

    public int getCels() {
        return cels;
    }

    public void setCels(int cels) {
        this.cels = (cels - 32) * 5 / 9;
    }
}
class TemperaturaTeste extends Temperatura {

    public static void main(String[] args) {
        new Temperatura();
    }
}


pplication logic here
    }
    
}
