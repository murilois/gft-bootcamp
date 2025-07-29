package poo;

// vimport java.util.Scanner;

public class POO {
    public static void main(String[] args) {
        //void = não retorna nada
        //static significa que não pertence a sua instância
        //static são declaradas no corpo da classe, então não podemos utilizar o THIS
    // final var = constante, ou seja, não pode ser atualizada, ao utilizar final var male = new Person()
        // Não poderemos utilizar male = new Person() caso queira criar algo novo
    var male = new Person();
    male.setName("Murilo");
    male.setAge(20);
    var female = new Person();
    female.setName("Manuela");
    female.setAge(17);
    System.out.printf("Olá, %s você tem %s anos \n", male.getName(), male.getAge());
    System.out.printf("Olá, %s você tem %s anos", female.getName(), female.getAge());
    }
}
