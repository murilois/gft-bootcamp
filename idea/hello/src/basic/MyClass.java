package basic;
import java.util.Scanner;

public class MyClass {

    private final static String WELCOME_MESSAGE = "Olá informe o seu nome: ";
    public static void main(String[] args){ // Precisa declarar com main
        // Comentário de uma linha
        /*
        * Comentário de várias linhas
        * Oh yeah!
        Dá pra tirar o *
        */
        //Scanner scanner = new Scanner(System.in);
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        //String name = scanner.next();
        var name = scanner.next();
        System.out.println("Informe a sua idade: ");
        //int age = scanner.nextInt();
        var age = scanner.nextInt();
        System.out.println("Olá " + name + " sua idade é " + age);
        System.out.printf("Olá %s sua idade é %s \n", name, age);
    }

}
