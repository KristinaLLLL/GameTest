
import android.widget.TextView;

public class Unit {
    public String getName() {
        return name;
    }

    private String name;
    private int health;
    public Unit (String name,int health){
        this.name=name;
        this.health=health;
    }
    public void printInfo(TextView textPlase){
        textPlase.append("Мeня зовут "+name+"\n");
    }
    public void leysGO(TextView textPlase){
        textPlase.append(name+"начал бежать");
    }
}
