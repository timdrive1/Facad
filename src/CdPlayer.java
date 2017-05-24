/**
 * Created by Тим on 24.05.2017.
 */
public class CdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier) {
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
        title = null;
        System.out.println(description + " вставить");
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " проиграть \"" + title + "\"");
    }

    public void play(int track) {
        if (title == null) {
            System.out.println(description + " не проиграть " + currentTrack +
                    ", ибо диск не вставлен");
        } else {
            currentTrack = track;
            System.out.println(description + " проигрывает " + currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " стоп");
    }

    public void pause() {
        System.out.println(description + " пауза \"" + title + "\"");
    }

    public String toString() {
        return description;
    }
}