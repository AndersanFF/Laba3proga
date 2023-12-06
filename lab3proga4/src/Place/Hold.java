package Place;

public class Hold implements Places{
    String palce = " трюм ";
    @Override
    public void come(String name){
        System.out.println(name + " посадили в" + palce);
    }
    public void were(String name){
        System.out.println("в" + palce + "томились" + name + "таких же несчастных");
    }
}
