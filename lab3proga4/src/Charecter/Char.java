package Charecter;

import Place.Places;

public abstract class Char {
    private String name;
    private String appearance;
    protected Places places;
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
    public String GetName(){
        return name;

    }

    public void SetPlace(Places place){
        this.places = place;
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
    

    
}
