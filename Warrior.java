//Team ererd: Jasper Cheung, Jake Zaia, Brandon Zhang 
//APCS1 pd5
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-20
public class Warrior extends Character{
    
    public Warrior(){
	name = "no body";
	hp = 125;
	strength = 100;
	basedef = 40;
	baseatk = .4;
	defense = basedef;
	atk = baseatk;
    }	    
    public Warrior(String n){
	this();
	name = n;}
   public void specialize(){
	defense = basedef / 2;
	atk = baseatk * 2;}
    public void normalize(){
	defense =  basedef;
	atk = baseatk;}

    public  String about(){
	return "Strong and sturdy";
    }
}
