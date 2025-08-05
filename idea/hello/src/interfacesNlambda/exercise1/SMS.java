package interfacesNlambda.exercise1;

public record SMS(String message) implements MarketingMessage{
    @Override
    public String sendMessage() {
        return message + "Esta mensagem está sendo enviada pelo SMS!";
    }
}
