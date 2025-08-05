package hrnANDplmf.exercise2;

public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        /*Essa instância é armazenada na variável brlClock, que é do tipo Clock. Isso é um exemplo de polimorfismo,
        onde um objeto de uma subclasse é tratado como se fosse da superclasse.
         */
        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(25);
        System.out.println(brlClock.getTime());
        System.out.println(new USClock().convert(brlClock).getTime());
    }
}
