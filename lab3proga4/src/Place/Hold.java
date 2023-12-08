package Place;

public class Hold implements Places{
    String place = " трюм ";
    @Override
    public void come(String name){
        System.out.println(name + " посадили в" + place);
    }
    @Override
    public void were(String name){
        System.out.println("в" + place + "томились" + name + "таких же несчастных");
    }
    @Override
    public String GetPlace(){
        return place;

    }
}
