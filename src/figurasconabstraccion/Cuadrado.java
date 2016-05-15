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
public class Cuadrado extends Figuras {
    private double lado;
    private double resultado;
    
    
    Cuadrado(){
    super();
    setColor("ROJO");
    setNombre("Cuadrado uno");
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El resultado es: "+lado*4);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
}
