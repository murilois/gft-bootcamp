package hrnANDplmf.exercise2;

public non-sealed class BRLClock extends Clock{

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock /* faz a verificação se USClock for uma instância e faz o cast*/-> this.hour = (usClock.getPeriodIndicator().equals("PM"))?
                        usClock.getHour() + 12 :
                        usClock.getHour();
            case BRLClock brlClock -> this.hour = brlClock.getHour(); //brlClock aq funciona quase como clock na linha 7 e 8
        }
        return this;
    }
}
