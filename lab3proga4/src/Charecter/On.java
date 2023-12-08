package Charecter;

public class On extends Char{
    
    public On(){
        super("Ему","Он");
    }
    @Override
    public void Action(String act, String user){
        System.out.println(this.name + act + user);
        
    }
    @Override
    public void Action(String act){
        System.out.println(this.appearance + " её" + act);
        
    }
        
    
}
