/**
 * Created by Тим on 24.05.2017.
 */
public class Projector {
    String description;
    DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println(description + " вкл");
    }

    public void off() {
        System.out.println(description + " выкл");
    }

    public void wideScreenMode() {
        System.out.println(description + " очень сложно");
    }

    public void tvMode() {
        System.out.println(description + " еще сложнее");
    }

    public String toString() {
        return description;
    }
}