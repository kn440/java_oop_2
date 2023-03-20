package Unit;

public abstract class BaseUnit implements UnitInterface {
    
    protected final String NAME;
    protected String info;
    protected float health;	 //текущий уровень здоровья
    protected int max_health;	//максимальное значение здоровья
    protected int lives;	//количество жизней
    protected float speed_move;	//скорость передвижения
    protected int experience;	//опыт (влияние на поведение)
    protected int visibility;	//видимость (с какого растояния может быть нанесен урон)
    protected int calories; //текущее значение калорий влияет на здоровье
    

    

    public BaseUnit (String info, String name, float health, int max_health, int lives, float speed_move, int experience, int visibility, int calories)
    {
        this.info=info;
        NAME=name;
        this.health=health;
        this.max_health=max_health;
        this.lives=lives;
        this.speed_move=speed_move;
        this.experience=experience;
        this.visibility=visibility;
        this.calories=calories;

    }
    @Override
    public void getNAME() {
        System.out.println(NAME);
    }
    @Override
    public void step() {
        System.out.println("Шаг.");
    }
    @Override
    public String getInfo()
    {
        
        return "Описание";
    }
    
}
