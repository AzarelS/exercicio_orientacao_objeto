
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo tri = new Triangulo();

        System.out.println("Digite a base do Triangulo: ");
        double base = Double.parseDouble(sc.nextLine());
        tri.setBase(base);
        System.out.println("Digite a base do Triangulo: ");
        double altura = Double.parseDouble(sc.nextLine());
        tri.setBase(altura);

        System.out.println("A area do Triangulo e: " + tri.getArea());

    }

}
