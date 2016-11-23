//Team ererd: Jasper Cheung, Jake Zaia, Brandon Zhang 
//APCS1 pd5
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-20
public class Monster extends Character{
    public Monster(){
	name = "Mike (with one i)";
	hp = 150;
	strength = (int) (Math.random() * 45 + 20);
	defense = 20;
	atk = 1;
    }
    public  String about(){
	return "He's just lonely";}
}


