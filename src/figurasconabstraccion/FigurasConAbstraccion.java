/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasconabstraccion;

/**
 *
 * @author oswaldosaldivar
 */
public class FigurasConAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();
        

       
        
        triangulo.setAltura(20);
        triangulo.setBase(12);
        triangulo.calcularArea();
        
        cuadrado.setLado(5);
        cuadrado.calcularArea();
        
        circulo.setRadio(9);
        circulo.calcularArea();
    }
    
}
