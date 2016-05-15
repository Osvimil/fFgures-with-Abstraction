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
public class Triangulo extends Figuras {
    private double base;
    private double altura;
    //private double resultado;
    
    Triangulo(){
    super();
    setColor("VERDE");
    setNombre("Primer triangulo");
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El resultado es: "+(base*altura)/2);
       
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
