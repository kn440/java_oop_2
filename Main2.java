
import java.util.ArrayList;
import java.util.Random;

import Unit.BaseUnit;
import Unit.Crossbowman;
import Unit.Farmer;
import Unit.Monk;
import Unit.Names;
import Unit.Robber;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Wizard;
public class Main2 {

    public static void main(String[] args)

{
    ArrayList<BaseUnit> list = new ArrayList<>();
        ArrayList<BaseUnit> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(6)){
                case 0:
                    list.add(new Crossbowman(null,getName()));
                    break;
                case 1:
                    list.add(new Monk(null,getName()));
                    break;
                case 2:
                    list.add(new Wizard(null,getName()));
                    break;  
                case 3:
                    list.add(new Robber(null,getName()));
                    break; 
                case 4:
                    list.add(new Spearman(null,getName()));
                    break;
                default:
                    list.add(new Sniper(null,getName()));
                    break;
            }
            switch (new Random().nextInt(6)){
                case 0:
                    list2.add(new Crossbowman(null,getName()));
                    break;
                case 1:
                    list2.add(new Monk(null,getName()));
                    break;
                case 2:
                    list2.add(new Wizard(null,getName()));
                    break;  
                case 3:
                    list2.add(new Robber(null,getName()));
                    break; 
                case 4:
                    list2.add(new Spearman(null,getName()));
                    break;
                default:
                    list2.add(new Sniper(null,getName()));
                    break;
            }}
        System.out.println("Имена игроков list1");
        list.forEach(u->u.getNAME());
        System.out.println("Имена игроков list2");
        list2.forEach(u->u.getNAME());
        System.out.println("Функция Step");
        list.forEach(u->u.step());
        System.out.println("Функция GetInfo");  
        list.forEach(u->u.getInfo()); 
        
    }

    





private static String getName(){
    return Names.values()[new Random().nextInt(Names.values().length)].toString();
}

}

