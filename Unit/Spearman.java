package Unit;

public class Spearman extends Warrior{

    public Spearman(String info,String name) {
        super(info,name, 100, 100, 10, 10, 2, 5, 20, 30);
    }

    @Override
    public void step() {
        System.out.println("Spearman сделал шаг!");
    }

    @Override
    public String getInfo() {
        info="Копейщик";
        System.out.println(info);
        return info;
    }
}
