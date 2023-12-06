package Place;

public class Los_paganos implements Places{
    String place = "Лос-Паганос";

    @Override
    public void come(String name){
        System.out.println(name + " доставили в " + place);
    }
    
}
