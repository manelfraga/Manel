public abstract class Figura implements Comparable<Figura> {
    public abstract double area();

    public int compareTo(Figura figura) {
        return (int) (figura.area() - this.area());
    }
}