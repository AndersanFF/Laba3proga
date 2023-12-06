import Charecter.Hundred;
import Charecter.Neznaika;
import Charecter.Patrol;
import Charecter.Ponchik;
import Charecter.Typo_Chel;
import Charecter.On;
import Objects.Plate;
import Place.Barrel;
import Place.Bridge;
import Place.Dumb_Island;
import Place.Los_paganos;
import Place.Hold;
import Place.Homeland;

public class Main {
    public static void main(String[] args){

    Neznaika neznaika = new Neznaika();
    On on = new On();
    Patrol patrol = new Patrol();
    Plate plate = new Plate();
    Ponchik ponchik = new Ponchik();
    Dumb_Island dumb_Island = new Dumb_Island();
    Bridge bridge = new Bridge();
    Los_paganos los_paganos = new Los_paganos();
    Hold hold = new Hold();
    Hundred hundred = new Hundred();
    Homeland homeland = new Homeland();
    Typo_Chel typo_Chel = new Typo_Chel();
    Barrel barrel = new Barrel();


    on.Action(" принес ", plate.name, on.name);
    on.Action(" Съел ", on.sub, on.appearance);
    ponchik.Action(" рассказал о ", ponchik.name, neznaika.name);
    dumb_Island.come(neznaika.name);
    bridge.come("Коротышки ");
    patrol.Capture("коротышек");
    los_paganos.come("их");
    hold.come("их");
    hold.were(" сотни ");
    hundred.Action(" плачут ",hundred.name, "");
    hundred.Action(hundred.action,hundred.name, homeland.place);
    neznaika.Action("заплакал", neznaika.name, null);
    typo_Chel.Action(" встал на ", typo_Chel.name, barrel.place);
    typo_Chel.Action(" начал утешать", typo_Chel.name, " всех ");
    typo_Chel.Action(" был ", typo_Chel.name, typo_Chel.appearance);


    }  
}
