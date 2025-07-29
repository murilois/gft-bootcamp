package poo;

public record Records(String name) {
    //private String name; // Não pode definir propriedades no corpo do record
    //private static String name; // apenas static
    // No record o construtor vem pelo parametro
    // Every (t o d o) atributo declarado no record é privado e utilizado em seu construtor e também é FINAL
    // Ou seja, o record é utilizado para valores IMUTÁVEIS
    // Pode ser utilizado como compact constructor
}
