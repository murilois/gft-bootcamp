package interfacesNlambda.exercise2;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GeometricArea geometricArea = null;
        while(true){
            System.out.println("Escolha a forma geométrica para calcular a área");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Quadrado");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair");
            var option = scanner.nextInt();
            switch (option){
                case 1 -> geometricArea = createRectangle();
                case 2 -> geometricArea = createSquare();
                case 3 -> geometricArea = createCircle();
                case 4 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
            System.out.println("A área da forma geométrica é: " + geometricArea.getArea());
        }
    }
    private static GeometricArea createSquare(){
        System.out.println("Informe o tamanho dos lados");
        var side = scanner.nextDouble();
        return new Square(side);
    }
    private static GeometricArea createRectangle(){
        System.out.println("Informe o tamanho da altura");
        var height = scanner.nextDouble();
        System.out.println("Informe o tamanho da base");
        var base = scanner.nextDouble();
        return new Rectangle(height, base);
    }
    private static GeometricArea createCircle(){
        System.out.println("Informe o tamanho do raio");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
