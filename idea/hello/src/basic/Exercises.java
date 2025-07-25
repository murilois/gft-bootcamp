package basic;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
          var scanner = new Scanner(System.in);
//        System.out.println("Digite seu nome");
//        var name = scanner.next();
//        System.out.println("Digite sua idade");
//        var age = scanner.nextInt();
//        System.out.printf("Olá %s você tem %s anos \n", name, age);
//        System.out.println("Insira o tamanho do lado do quadrado");
//        var side1 = scanner.nextInt();
//        var area1 = side1 * side1;
//        System.out.printf("A área do quadrado é: %s \n", area1);
//        System.out.println("Insira o tamanho da altura do retângulo");
//        var height = scanner.nextInt();
//        System.out.println("Insira o tamanho da base do retângulo");
//        var base = scanner.nextInt();
//        var area2 = height * base;
//        System.out.printf("A área do retângulo é: %s\n", area2);
        System.out.println("Digite o primeiro nome: ");
        var name1 = scanner.next();
        System.out.println("Digite o segundo nome: ");
        var name2 = scanner.next();
        System.out.println("Digite a primeira idade");
        var age1 = scanner.nextInt();
        System.out.println("Digite a segunda idade");
        var age2 = scanner.nextInt();
        var difference = age1 - age2;
        System.out.printf("A diferença da idade de %s e %s é de %s anos\n", name1, name2, difference);
    }
}
