public class GestorFigurasTest {
    public static void main(String [] args ){
        Figura[]figura = new Figura[4];
        figura[0]=new Rectangulo(10,5);
        figura[1]=new Circulo(8.5);
        figura[2]=new Cuadrado(4);
        figura[3]=new Triangulo(4,6);

        GestorFiguras gestor = new GestorFiguras();

        double SumaAreas = gestor.Suma(figura);
        System.out.println(SumaAreas);

        gestor.sort(figura);
        for (Figura value : figura) {
            System.out.println("Figura:" + value.getClass().getName() + ", Área:" + value.area());
        }
        System.out.println("Suma de todas las áreas:" + SumaAreas);
        }


    }


