package loops;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        System.out.println("Insira seu nome:");
//        var name = scanner.next();
//        System.out.println("Insira sua idade:");
//        var age = scanner.nextInt();
//        System.out.println("Você é emancipado? (s/n) ");
//        var isEmancipated = scanner.next().equalsIgnoreCase("s");
//        if (age>= 18) {
//            System.out.printf("%s, vocẽ tem %s anos e pode dirigir \n", name, age);
//            //variaveis criadas dentro de If e Else tem escopo local, ou seja, não funciona fora
//        } else if (age>=16 && isEmancipated){
//            System.out.printf("%s, vocẽ tem %s anos e pode dirigir \n", name, age);
//        }
//        else{
//            System.out.printf("%s, você não pode dirigir \n", name);
//        }
        // Elvis operator ?:
        // Condição ?
        // True : False
        // Exemplo: canDrive ? True= executa o primeiro antes do : False = executa o primeiro depois do :
        var scanner = new Scanner(System.in);
        System.out.println("Insira um número de 1 até 7:");
        var option = scanner.nextInt();
        switch (option) {
            case 1 -> System.out.println("Domingo"); // Assim não precisa de break
        // case 1,7 ->{
        //  var day = option == 1 ? "Domingo" : "Sábado";
        //  yield String.format("Hoje é %s, fim de semana!", day);
        // }
//            case 1:
//                System.out.println("Domingo");
//                break; Precisa do break pq se não ele executa o próximo case
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sábado");
//                break;
//            default:
//                System.out.println("Inválido");
        }
    }
}
