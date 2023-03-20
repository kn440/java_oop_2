package Unit;

public class Monk extends MagicMan {

    public Monk(String info,String name){
        super(info, name, 10, 100, 1, 5, 1, 10, 0, 20 );
        
    }

    @Override
    public void step() {
        System.out.println("Monk сделал шаг!");
    }
    @Override
    public String getInfo() {
        info="Монах";
        System.out.println(info);
        return info;
    }
} 

