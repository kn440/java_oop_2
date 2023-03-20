package Unit;

public class Crossbowman extends Scooter {

    public Crossbowman(String info,String name) {
        super(info,name, 100, 100, 2, 10, 1, 1, 20, 10, 100);
        
    }
    
    @Override
    public void step() {
        
        System.out.println("Crossbowman сделал шаг!");
    }
    @Override
    public String getInfo() {
        info="Арбалетчик";
        System.out.println(info);
        return info;
    }

}
