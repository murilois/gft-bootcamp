package basic;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        System.out.println(value1 + "+" + value2 + "=" + value1 + value2); //Não funciona pois esta concatenando as strings então ficaria por exemplo 1+1 = 11
        System.out.println(value1 + "+" + value2 + "=" + (value1 + value2)); //Funciona pois entre parenteses ele compreende que é a adição...
        //System.out.printf("%s + %s = %s \n", value1, value2, value1 + value2);
        // Operadores + - * / %(Resto da divisão)
        // A divisão só retornara o valor com decimais caso esteja declarado o nextFloat, por exemplo
        // var += 5
        //Importação da classe Math ex: Math.sqrt() raiz quadrada Math.pow(2, 3) = 8
        // Incrementação ++Value (soma na linha) Value++(Soma na próxima linha)
    }
}
