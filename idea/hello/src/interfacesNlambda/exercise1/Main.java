package interfacesNlambda.exercise1;


import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MarketingMessage marketingMessage= null;
        while(true) {
            System.out.println("Escolha por onde enviar a mensagem");
            System.out.println("1 - SMS");
            System.out.println("2 - Redes Sociais");
            System.out.println("3 - Email");
            System.out.println("4 - Whatsapp");
            System.out.println("5 - Sair");
            var option = scanner.nextInt();
            switch (option) {
                case 1 -> marketingMessage = new SMS("Olá, ");
                case 2 -> marketingMessage = new SocialMedias("Olá, ");
                case 3 -> marketingMessage = new Email("Olá, ");
                case 4 -> marketingMessage = new Whatsapp("Olá, ");
                case 5 -> System.exit(0);
                default -> {
                    System.out.println("Opção inválida");
                    continue;
                }
            }
            System.out.println(marketingMessage.sendMessage());
        }
    }
}
