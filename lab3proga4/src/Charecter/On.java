package Charecter;

public class On extends Char{
    
    public On(){
        super("Ему","Он");
    }

    @Override
    public void Action(String act, String name, String user){
        System.out.println(user + act + name);
        
    }
        
    
}
