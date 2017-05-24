/**
 * Created by Тим on 24.05.2017.
 */
public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " выше?");
    }

    public void down() {
        System.out.println(description + " ниже?");
    }


    public String toString() {
        return description;
    }
}