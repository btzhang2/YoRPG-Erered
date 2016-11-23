//Team ererd: Jasper Cheung, Jake Zaia, Brandon Zhang 
//APCS1 pd5
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-20
public abstract class Character{
    protected String name, description;
    protected int hp, strength, defense, basedef;
    protected double atk, baseatk;
    
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
    public int attack(Character c){
	 int i = (int) ( strength * atk - c.getDefense());
	 if (i < 0)
	     i = 0;
	 c.lowerHP(i);
	 return i;
    }
    abstract void specialize();
    abstract void normalize();

    abstract String about();
}
