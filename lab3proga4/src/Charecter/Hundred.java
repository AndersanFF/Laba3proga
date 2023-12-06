package Charecter;

public class Hundred extends Char{

    public Hundred(){
        super("сотня","");
    }
    public String action = " прощались ";

    @Override
    public void Action(String act, String name, String user){
        System.out.println(name + act + user);
    }
    
}
