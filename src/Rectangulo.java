public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo (double b, double a)
    {
        this.altura=a;
        this.base=b;
    }


    @Override
    public double area() {
        return (altura*base);
    }

    @Override
    public int compareTo(Figura o) {
        return super.compareTo(o);
    }
}


