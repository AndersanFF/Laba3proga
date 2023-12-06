package Charecter;

public class Typo_Chel extends Char{
    public Typo_Chel(){
        super("Коротышка","Без рубашки, босиком, в соломенной шляпе и шерстяным шарфом");
    }
    
    @Override
    public void Action(String act, String name, String user){
        System.out.println(name + act + user);
    }
}
