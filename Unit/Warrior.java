package Unit;

public abstract class Warrior extends BaseUnit{
    protected int damage; // сила удара
    public Warrior(String info,String name, float health, int max_health, int lives, float speed_move, int experience,
            int visibility, int calories, int damage) {
        super(info, name, health, max_health, lives, speed_move, experience, visibility, calories);
        this.damage=damage;
    }
    
    

    
}
