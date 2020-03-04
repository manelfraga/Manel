import java.util.Arrays;

public class GestorFiguras {

    public double Suma (Figura[] figura){
        int i=0;
        double AreaTotal=0;
        while(i<figura.length) {
            AreaTotal = AreaTotal + figura[i].area();
            i++;
        }
        return AreaTotal;
    }
    public void sort (Figura[] figura){
        Arrays.sort(figura);
    }
}
