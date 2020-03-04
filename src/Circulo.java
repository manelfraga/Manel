public class Circulo extends Figura {
    private double radio;

    public Circulo (double r)
    {
        this.radio=r;
    }


    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public int compareTo(Figura o) {
        return 0;
    }
}
