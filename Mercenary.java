//Team ererd: Jasper Cheung, Jake Zaia, Brandon Zhang 
//APCS1 pd5
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-20

public class Mercenary extends Character{
    
    public Mercenary(){
	name = "no body";
	hp = 100;
	strength = 50;
	basedef = 20;
	baseatk = .6;
	defense = basedef;
	atk = baseatk;
    }
    public void specialize(){
	defense = basedef / 2;
	atk = baseatk * 2;}
    public void normalize(){
	defense =  basedef;
	atk = baseatk;}
    public Mercenary(String n){
	this();
	name = n;}

    public  String  about(){
	return "Anything for money";
    }

    
}
