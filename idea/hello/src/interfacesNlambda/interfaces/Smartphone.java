package interfacesNlambda.interfaces;

public class Smartphone implements VideoPlayer, MusicPlayer{ //Você só pode herdar 1 classe por vez, porém ‘interface’ podem mais

    @Override
    public void stopVideo() {
        System.out.println("Parando vídeo");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando música");
    }

    @Override
    public void playMusic() {
        System.out.println("Tocando música");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausando vídeo");
    }

    @Override
    public void playVideo() {
        System.out.println("Rodando o vídeo");
    }
}
