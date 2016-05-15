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
public class Circulo extends Figuras {
    
    private final static double PI = 3.1416;
    private double radio;
    private double resultado;
    
    Circulo(){
    super();
    setColor("Blanco");
    setNombre("Primer circulo");
    
    }
    @Override
    public void calcularArea(){
        System.out.println("El resultado es: "+PI*radio*radio);        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
