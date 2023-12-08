package Charecter;

import Interface.GosOrgan;

public class Patrol extends Char implements GosOrgan{
    public Patrol(){
        super("Полицейский патруль", "");
    }

    @Override
    public void Action(String act, String name, String user){
        System.out.println(user + act + name);
        
    }

    @Override
    public void Capture(String target){
        System.out.println(GetName() +" поймал " + target);
    }
    
}
