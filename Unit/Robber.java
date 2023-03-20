package Unit;

public class Robber extends RobberBase{

    public Robber(String info,String name) {

        super(info, name, 1, 100, 2, 5.0f, 4, 2, 10, 4, 200);
    }
   @Override
   public void step() {
    System.out.println("Robber сделал шаг!");
   }
   @Override
   public String getInfo() {
    info="Вор";
    System.out.println(info);
    return info;
   }
}
