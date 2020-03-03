public class Círculo extends Figura {
    private double radio;

    public Círculo (double r)
    {
        this.radio=r;
    }


    public double area() {
        return Math.Pi * radio * radio;
    }
}
