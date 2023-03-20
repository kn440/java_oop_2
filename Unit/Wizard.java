package Unit;

public class Wizard extends MagicMan{

    public Wizard(String info,String name) {
        super(info, name, 10, 100, 1, 5, 1, 10, 10, 30);
        
    }
    @Override
    public void step() {
        System.out.println("Wizard сделал шаг!");
    }

    @Override
    public String getInfo() {
        info="Маг";
        System.out.println(info);
        return info;
    }
    
}

