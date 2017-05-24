/**
 * Created by Тим on 24.05.2017.
 */
public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " вкл");
    }

    public void off() {
        System.out.println(description + " выкл");
    }

    public void dim(int level) {
        System.out.println(description + " свет " + level  + "%");
    }

    public String toString() {
        return description;
    }
}