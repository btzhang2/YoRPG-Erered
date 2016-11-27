//Team ererd: Jasper Cheung, Jake Zaia, Brandon Zhang 
//APCS1 pd5
//HW #35: Ye Olde Role Playing Game, Realized
//2016-11-20
public abstract class Character{
    protected String name, description, move;
    protected int hp, strength, magicPower, specialAtkBar, defense, basedef;
    protected double atk, baseatk;

    public Character(){
	specialAtkBar = 0;
    }
    
    public boolean isAlive(){
	return hp > 0;
    }
    public int getDefense(){
	return defense;
    }
    public String  getName(){
	return name;
    }
    public void lowerHP(int i){
	hp -= i;
    }
    public String getMove(){
	return move;
    }
    public int getSpecialAtkBar(){
	return specialAtkBar;
    }
    public void setHP(int h){
	hp = h;
    }
    public int attack(Character c){
	 int i = (int) ( strength * atk - c.getDefense());
	 if (i < 0)
	     i = 0;
	 c.lowerHP(i);
	 if (specialAtkBar < 4)
	     specialAtkBar += 1;
	 return i;
    }
    public int specialMove(Character c){
	int i = (int) ( magicPower * atk - c.getDefense() );
	if (i < 0)
	    i = 0;
	c.lowerHP(i);
	specialAtkBar = 0;
	return i;
    }
    abstract void specialize();
    abstract void normalize();
    abstract String about();
}
