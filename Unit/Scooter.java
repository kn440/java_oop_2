package Unit;

public abstract class Scooter extends Warrior {

    protected int number_shells; // количество снарядов

    public Scooter(String info, String name, float health, int max_health, int lives, float speed_move, int experience,
            int visibility, int calories, int damage,int number_shells) {
        super(info,name, health, max_health, lives, speed_move, experience, visibility, calories, damage);
        this.number_shells=number_shells;
    }


}


