package Place;

public class Dumb_Island implements Places{

    String Dumb = "Дурацкий остров";

    @Override
    public void come(String name){
        System.out.println(name + "попадает на " + Dumb);

    }
    
}
