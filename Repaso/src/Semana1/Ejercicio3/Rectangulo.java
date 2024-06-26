package Semana1.Ejercicio3;

public class Rectangulo extends Figura {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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

    @Override
    public double calcularArea() throws Exception {
        if(base <= 0 || altura <= 0){
            throw new Exception("La base y la altura no pueden ser negativas");
        }
        return base * altura;
    }


    
}
