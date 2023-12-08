import Charecter.Char;
import Charecter.Hundred;
import Charecter.Neznaika;
import Charecter.Patrol;
import Charecter.Ponchik;
import Charecter.Typo_Chel;
import Charecter.On;
import Objects.Objects;
import Objects.Plate;
import Place.Barrel;
import Place.Bridge;
import Place.Dumb_Island;
import Place.Los_paganos;
import Place.Places;
import Place.Hold;
import Place.Homeland;

public class Main {
    public static void main(String[] args){

    Char neznaika = new Neznaika();
    Char on = new On();
    Char patrol = new Patrol();
    Objects plate = new Plate();
    Char ponchik = new Ponchik();
    Places dumb_Island = new Dumb_Island();
    Places bridge = new Bridge();
    Places los_paganos = new Los_paganos();
    Places hold = new Hold();
    Char hundred = new Hundred();
    Places homeland = new Homeland();
    Char typo_Chel = new Typo_Chel();
    Places barrel = new Barrel();

    on.Action(" принес ", plate.GetName(), on.GetName());
    on.Action(" Съел ","её ", on.GetAppearance());
    ponchik.Action(" рассказал о ", ponchik.GetName(), neznaika.GetName());
    dumb_Island.come(neznaika.GetName());
    bridge.come("Коротышки ");
    patrol.Capture("коротышек");
    los_paganos.come("их");
    hold.come("их");
    hold.were(" сотни ");
    hundred.Action(" плачут ",hundred.GetName());
    hundred.Action(hundred.GetAction(),hundred.GetName(), homeland.GetPlace());
    neznaika.Action("заплакал", neznaika.GetName()); 
    typo_Chel.Action(" встал на ", typo_Chel.GetName(), barrel.GetPlace());
    typo_Chel.Action(" начал утешать", typo_Chel.GetName(), " всех ");
    typo_Chel.Action(" был ", typo_Chel.GetName(), typo_Chel.GetAppearance());
    neznaika.SetPlace(barrel);


    }  
}
