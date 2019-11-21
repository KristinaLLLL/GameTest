import android.widget.TextView;

public class Rbot extends Unit{
    private int energy;

    @Override
    public void printInfo(TextView textPlase) {
        super.printInfo(textPlase);
    }

    @Override
    public void leysGO(TextView textPlase) {
        super.leysGO(textPlase);
        energy--;
        textPlase.append((name+"Энергия уменьшилась до"+energy));
    }

    public Rbot(String name, int health) {
        super(name, health);
        this.energy=energy;
    }
}
