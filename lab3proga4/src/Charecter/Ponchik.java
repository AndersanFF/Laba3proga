package Charecter;

public class Ponchik extends Char{
    public Ponchik(){
        super("Пончик", "");
    }
    @Override
    public void Action(String act, String user){
        System.out.println(this.name + act + user + "было правдой");

    }
    
}
