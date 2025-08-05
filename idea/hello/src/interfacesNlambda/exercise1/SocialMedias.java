package interfacesNlambda.exercise1;

public record SocialMedias(String message) implements MarketingMessage{
    @Override
    public String sendMessage() {
        return message + "Esta mensagem está sendo enviada pelas redes sociais!";
    }
}
