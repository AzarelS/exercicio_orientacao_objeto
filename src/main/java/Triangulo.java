import java.util.Scanner;

public class Triangulo {

private double base;
private double altura;

/**
 * Construtor sem Parametros
 */
public Triangulo (){
    System.out.println("Construtor: " + this);
    setBase(0);
    setAltura(0);
}

/**
 * Contrutor com Parametros 
 * @param base A base do Triangulo
 * @param altura A altura do triangulo
 */
public Triangulo (double base, double altura){
    setBase(base);
    setAltura(altura);
}

/**
 * Recuperador da base
 * @return  A base do Triangulo
 */
    public double getBase() {
        return base;
    }
    
/**
 * Recuperador da altura
 * @return  A altura do Triangulo
 */
    public double getAltura() {
        return altura;
    }
    
/**
 * Modificador da base
 * @param base A altura do riangulo
 */
    public void setBase(double base) {
        this.base = base;
    }
    
/**
 * Modificador da altura
 * @param altura A altura do triangulo
 */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getArea () {
        double area = (getBase() + getAltura())/2;
        return area;
    }
}
