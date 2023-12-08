package Place;

public class Dumb_Island implements Places{

    String place = "Дурацкий остров";

    @Override
    public void come(String name){
        System.out.println(name + "попадает на " + place);

    }
    @Override
    public String GetPlace(){
        return place;

    }
    @Override
    public void were(String name){}
    
}
