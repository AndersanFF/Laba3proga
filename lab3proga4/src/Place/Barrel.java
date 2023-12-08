package Place;

public class Barrel implements Places{

    private String place = "бочка";

    @Override
    public void come(String name){
    }
    @Override
    public String GetPlace(){
        return place;

    }
    @Override
    public void were(String name){}

}
