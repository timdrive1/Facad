/**
 * Created by Тим on 24.05.2017.
 */
public class PopcornPopper {
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " вкл");
    }

    public void off() {
        System.out.println(description + " выкл");
    }

    public void pop() {
        System.out.println(description + " жуй");
    }


    public String toString() {
        return description;
    }
}