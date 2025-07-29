package poo;

public class Person {

    private String name;
    private int age;

//    Getter e Setter
    public String getName(){
        return this.name; // Get = função para receber
    }
    //Exemplo de construtor
    /*
    public Person(String name) {
        this.name = name;
        }
        isso substitui o setName, por exemplo, porém é melhor utilizado para constantes,
        ai seria melhor utilizar private final String name
     */
    public void setName(String name){
        this.name = name; //Set = função pra definir
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
