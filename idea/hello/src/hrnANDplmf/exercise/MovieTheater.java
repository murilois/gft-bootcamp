package hrnANDplmf.exercise;

import java.util.Scanner;

public class MovieTheater{
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Ticket ticket = new Ticket(20.0, "Superman", "Dublado");
        System.out.printf("Valor do ingresso: R$%s. Nome do filme:%s Tipo: %s", ticket.getValue(), ticket.getMovieName(), ticket.getDubOrLeg());
        System.out.println("Insira qual tipo de ingresso: ");
        System.out.println("1 - Individual ");
        System.out.println("2 - Meia-entrada ");
        System.out.println("3 - Família ");
        var type = scanner.nextInt();
        switch (type){
            case 1 -> System.out.println(ticket.getValue());
            case 2 -> {
                HalfTicket ticket1 = new HalfTicket(ticket.getValue(), ticket.getMovieName(), ticket.getDubOrLeg());
                System.out.println(ticket1.getHalfValue());
            }
            case 3 -> {
                System.out.println("Digite a quantidade: ");
                var quantity = scanner.nextInt();
                FamilyTicket ticket2 = new FamilyTicket(ticket.getValue(), ticket.getMovieName(), ticket.getDubOrLeg(), quantity);
                ticket2.setQuantity(quantity);
                System.out.println("Valor dos ingressos para" + ticket2.getQuantity() + "R$" + ticket2.getFamilyValue(quantity));
            }
        }
    }


}
