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
    @Override
    public void Action(String act){
        System.out.println(this.name + act );
    }
    @Override
    public void Action(){
        System.out.println(this.name + action + this.places);
    }
    
    @Override
    public String GetAction(){
        return this.action;
    }


    
}
