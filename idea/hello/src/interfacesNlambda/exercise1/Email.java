package interfacesNlambda.exercise1;

public record Email(String message) implements MarketingMessage{
    @Override
    public String sendMessage() {
        return message + "Esta mensagem está sendo enviada pelo email";
    }
}
