public class GestorFigurasTest {
    public static void main(String [] args ){
        Figura[]figura = new Figura[100];
        figura[0]=new Rectangulo(10,5);
        figura[1]=new Círculo(8.5);
        figura[2]=new Cuadrado(4);
        figura[3]=new Triángulo(4,6);

        double SumaAreas = GestorFiguras.Suma(figura);
        System.out.println(SumaAreas);

        GestorFiguras.sort(figura);
        for (int i=0; i<figura.length;i++){
            System.out.println("Figura:" + figura[i].getClass().getName() +", Área:"+ figura[i].area());
        }
        System.out.println("Suma de todas las áreas:" + SumaAreas);
        }


    }


