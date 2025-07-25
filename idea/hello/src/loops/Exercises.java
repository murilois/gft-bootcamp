package loops;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um número");
        var number1 = scanner.nextInt();
        do{
            System.out.println("Insira outro número");
            var number2 = scanner.nextInt();
            if (number2 < number1){
                System.out.println("Menor que o primeiro número, inválido");
                continue;
            }
            if (number2 % number1 != 0){
                System.out.println("Resto de divisão diferente de 0, tchau!");
                break;
            }
        }while(true);




        /* Exercício 1 - Tabuada
        System.out.println("Insira um número");
        var number1 = scanner.nextInt();
        for(var i = 0; i <= 10; i++){
            var multiplier = number1 * i;
            System.out.printf("%s x %s = %s\n",number1,i,multiplier);
         */
        /* Exercício 2 - IMC
        System.out.println("Insira sua altura");
        var height = scanner.nextFloat();
        System.out.println("Insira seu peso");
        var weight = scanner.nextInt();
        var imc = weight/(height * height);
        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <=24.9) {
            System.out.println("Peso ideal");
        }else if (imc >= 25.0 && imc <=29.9) {
            System.out.println("Levemente acima do peso");
        }else if (imc >= 30.0 && imc <=34.9) {
            System.out.println("Obesidade Grau I");
        }else if (imc >= 35.0 && imc <=39.9) {
            System.out.println("Obesidade Grau II(Severa)");
        }else{
            System.out.println("Obesidade Grau III");
        }
         */
        /* Exercício 3 - Par ou Impar
        System.out.println("Insira um número");
        var number1 = scanner.nextInt();
        System.out.println("Insira outro número, maior que o primeiro");
        var number2 = scanner.nextInt();
        while(number2 <= number1){
            System.out.println("Insira outro número, maior que o primeiro");
            number2 = scanner.nextInt();
        }
        System.out.println("Vocẽ quer par ou impar?");
        var evenOrOdd = scanner.next();
        for(var i = number2; i >= number1; i--){
            if(evenOrOdd.equalsIgnoreCase("par")){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }else{
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }

         */
    }
}
