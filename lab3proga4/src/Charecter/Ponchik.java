package Charecter;

public class Ponchik extends Char{
    public Ponchik(){
        super("Пончик", "");
    }
    @Override
    public void Action(String act, String name, String user){
        System.out.println(name + act + user + "было правдой");

    }
    
}
