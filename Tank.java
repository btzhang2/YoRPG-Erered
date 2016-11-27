//Team ererd: Jasper Cheung, Jake Zaia, Brandon Zhang 
//APCS1 pd5
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-20

public class Tank extends Character{
    public Tank(){
	super();
	name = "no body";
	hp = 300;
	strength = 35;
	basedef = 50;
	baseatk = .3;
	defense = basedef;
	atk = baseatk;
	magicPower = 50;
	move = "Shield smash";
    }
    public Tank(String n){
	this();
	name = n;}

    public void specialize(){
	defense = basedef / 2;
	atk = baseatk * 2;}
    public void normalize(){
	defense =  basedef;
	atk = baseatk;}
    

    public String about(){
	return "A bulkier version of the generic melee";
    }    
}
