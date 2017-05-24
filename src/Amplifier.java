/**
 * Created by Тим on 24.05.2017.
 */
public class Amplifier {
    String description;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " вкл");
    }

    public void off() {
        System.out.println(description + " выкл");
    }

    public void setStereoSound() {
        System.out.println(description + " годнота в стерео");
    }

    public void setSurroundSound() {
        System.out.println(description + " долбИ дОлби");
    }

    public void setVolume(int level) {
        System.out.println(description + " громкость " + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " тюнер " + dvd);
        this.tuner = tuner;
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println(description + " двд " + dvd);
        this.dvd = dvd;
    }

    public void setCd(CdPlayer cd) {
        System.out.println(description + " цд " + cd);
        this.cd = cd;
    }

    public String toString() {
        return description;
    }
}