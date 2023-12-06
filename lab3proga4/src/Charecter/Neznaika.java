package Charecter;

public class Neznaika extends Char{

    public Neznaika(){
    super("Незнайка ","В шапке");
    }

    @Override
    public void Action(String act, String name, String user){
        System.out.println(name + act);
        
    }

    
}
