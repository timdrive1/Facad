/**
 * Created by Тим on 24.05.2017.
 */
public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " вкл");
    }

    public void off() {
        System.out.println(description + " выкл");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + " частота " + frequency);
        this.frequency = frequency;
    }

    public void setAm() {
        System.out.println(description + " Ам моде");
    }

    public void setFm() {
        System.out.println(description + " Фм моде ");
    }

    public String toString() {
        return description;
    }
}