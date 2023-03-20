package Unit;

public class Sniper extends Scooter {

    public Sniper(String info,String name) {
        super(info,name, 100, 100, 1, 1, 1, 1, 10, 50, 5);

    }

    @Override
    public void step() {
        System.out.println("Sniper сделал шаг!");
    }

    @Override
    public String getInfo() {
        info="Снайпер";
        System.out.println(info);
        return info;
    }
    
}
    
