package interfacesNlambda.interfaces;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Smartphone();
        runMusic(musicPlayer);//Funciona
        /*
        runVideo(musicPlayer);
        Não funciona, a menos que faça um cast de videoPlayer para o music ‘player’
        ou declare o musicPlayer como ‘Smartphone’
        ou do jeito abaixo:
         */
        runVideo(new Smartphone());//Funciona
        //Também posso colocar dentro dos parametros as new Smartphone em ambos para funcionamento
    }
    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }
    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
