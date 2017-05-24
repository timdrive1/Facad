/**
 * Created by Тим on 24.05.2017.
 */
public class DvdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " вкл");
    }

    public void off() {
        System.out.println(description + " выкл");
    }

    public void eject() {
        movie = null;
        System.out.println(description + " вставить");
    }

    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        System.out.println(description + " проигрывает \"" + movie + "\"");
    }

    public void play(int track) {
        if (movie == null) {
            System.out.println(description + " не проиграть " + track + " ибо диска нет");
        } else {
            currentTrack = track;
            System.out.println(description + " проигрывает " + currentTrack + movie + "\"");
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " стоп \"" + movie + "\"");
    }

    public void pause() {
        System.out.println(description + " пауза \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        System.out.println(description + " звук на два канала");
    }

    public void setSurroundAudio() {
        System.out.println(description + " что-то");
    }

    public String toString() {
        return description;
    }
}