public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo (double b, double a)
    {
        this.altura=a;
        this.base=b;
    }


    public double area() {
        return (altura*base);
    }
}


