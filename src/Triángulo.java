public class Triángulo extends Figura {
    private double base;
    private double altura;

    public Triángulo (double b, double a)
    {
        this.base=b;
        this.altura=a;
    }

    @Override
    public double area() {
        return (base * altura * 0.5);
    }

    @Override
    public int compareTo(Figura o) {
        return 0;
    }
}
