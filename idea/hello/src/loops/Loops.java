package loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um nome");
        var name = scanner.next();
        System.out.println(name);
        System.out.println("Loop ativado");
        /*for(;;){
            System.out.println("Digite um nome");
            var name = scanner.next();

            if (name.equalsIgnoreCase("exit")) break;
            System.out.println(name);
        }*/
        //for(var i = 1; i <= 100; i++){}
        //for(começo; até quando; o que fazer)
        while(!name.equalsIgnoreCase("exit")){
            System.out.println("Digite um nome");
            name = scanner.next();
            System.out.println(name);
        }
        /* do{
            System.out.println("Digite um nome");
            name = scanner.next();
            System.out.println(name);
            }
         while(!name.equalsIgnoreCase("exit"));
         */

    }
}
