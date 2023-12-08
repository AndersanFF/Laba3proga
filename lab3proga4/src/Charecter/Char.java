package Charecter;

import Place.Places;

public abstract class Char {
    protected String name;
    protected String appearance;
    protected String places;
    protected String sub;
    protected String action;
    

    public Char(String name, String appearance){
    this.name = name;
    this.appearance = appearance;
    }
    public void Action(String act, String name){
        
    }
    public void Action(String act, String name, String user){

    }
    public void Action(String act){
       
    }
    public void Action(){
       
    }
    public String GetName(){
        return name;

    }

    public void SetPlace(Places place){
        places = place.GetPlace();
    }

    public String GetAppearance(){
        return appearance;
    }

    public void SetSub(String sub){
        this.sub =  sub;
    }
    public void Capture(String target){

    } 
    public String GetAction(){
        return this.action;
    }
    public String GetPlace(){
        return places;
    
    }
    public void Action(String act, String name, Places place){
        System.out.println(name + act + place.GetPlace());
    }
    

    
}
