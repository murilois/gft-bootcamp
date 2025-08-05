package poo.exercises.exercise1;


import java.util.Scanner;

public class BankAccount {
    private final static Scanner scanner = new Scanner(System.in);
    private static Account account;
    public static void main(String[] args) {
        var option = -1;
        System.out.print("Valor do depósito inicial: R$");
        var initialDeposit = scanner.nextFloat();
        account = new Account(initialDeposit);

        do{
            System.out.println("Escolha uma das opções:");
            System.out.println("=======================");
            System.out.println("1 - Consultar saldo.");
            System.out.println("2 - Consultar limite do cheque especial.");
            System.out.println("3 - Depositar dinheiro.");
            System.out.println("4 - Sacar dinheiro.");
            System.out.println("5 - Pagar um boleto.");
            System.out.println("6 - Verificar se a conta está usando cheque especial.");
            System.out.println("7 - Finalizar operação.");
            option = scanner.nextInt();
            switch (option){
                case 1 -> consultingBalance();
                case 2 -> consultingSpecialCheck();
                case 3 -> depositBalance();
                case 4 -> withdrawBalance();
                case 5 -> payingBill();
                case 6 -> isUsingSpecialCheck();
                case 7 -> System.exit(0);
                default -> System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }while(true);

    }
    public static void consultingBalance(){
        var balance = account.getBalance();
        System.out.printf("O saldo da conta é de R$%s \n", balance);
    }
    public static void consultingSpecialCheck(){
        var specialCheck = account.getLimitSpecialCheck();
        System.out.printf("O cheque especial da conta é de R$%s \n", specialCheck);
    }
    public static void depositBalance(){
        System.out.println("Insira o valor para depósito");
        var depositing = scanner.nextFloat();
        account.deposit(depositing);
    }
    public static void withdrawBalance(){
        System.out.println("Insira o valor para saque");
        var withdrawing = scanner.nextFloat();
        account.withdraw(withdrawing);
    }
    public static void payingBill(){
        System.out.println("Insira o valor do boleto para ser pago");
        var billValue = scanner.nextFloat();
        account.payBill(billValue);
    }
    public static void isUsingSpecialCheck(){
        System.out.println(account.getSpecialCheckStatus());
    }
}
