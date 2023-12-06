package Place;

public class Bridge implements Places{
    String place = "мост";
    @Override
    public void come(String name){
        System.out.println(name + " ночевали под "+ place);
    }
    
}
