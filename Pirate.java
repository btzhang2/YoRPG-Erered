public//Team ererd: Jasper Cheung, Jake Zaia, Brandon Zhang 
//APCS1 pd5
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-20
 class Pirate extends Character{
    
    public Pirate(){
	name = "no body";
	hp = 125;
	strength = 100;
	basedef = 40;
	baseatk = .4;
	defense = basedef;
	atk = baseatk;
    }
    public void specialize(){
	defense = basedef / 2;
	atk = baseatk * 2;}
    public void normalize(){
	defense =  basedef;
	atk = baseatk;}
    public Pirate(String n){
	this();
	name = n;}

    public  String about(){
	return "Arrrrrrr";
    }
}
