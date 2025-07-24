import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        System.out.println("Quanto é 2+2?");
//        var result = scanner.nextInt();
//        System.out.printf("O resultado é 4, você acertou? (%s)", result == 4);
        // == se for igual != diferente !negação do boolean > < >= <=
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem? ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? ");
        var isEmancipated = scanner.nextBoolean(); //Ele recebe apenas true or false
        var canDrive = age >= 18 || isEmancipated; // OR || inteligente OR burro |, o inteligente é mais rápido pois tendo um true ele já retorna true
        System.out.printf("O resultado é 4, você acertou? (%s)", canDrive);
    }
}
