public class GestorFiguras {
    private static GestorFiguras Arrays;

    public static double Suma (Figura[] figura){
        int i=0;
        double AreaTotal=0;
        while(i<figura.length) {
            AreaTotal = AreaTotal + figura[i].area();
        }
        return AreaTotal;
    }
    public static void sort (Figura[] figura){
        Arrays.sort(figura);
    }
}
