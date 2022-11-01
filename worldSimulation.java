import Classes.*;

public class worldSimulation {
    public static void main(String[] args) {
    int f=1,year=1;
    World.humidity=50;
    World.temperature=5;
    Ground.soilFertility=55;
    Ground.waterAmount=25;
    Humans people = new Humans();
    Sharks shark = new Sharks();
    Rats hamster = new Rats();
    Weapons weapon = new Weapons();
    Tsunami tsunami = new Tsunami();
    Earthquake earthquake = new Earthquake();
    people.setAttributes(0, 100, 60, -20, 500, 20,10);
    shark.setAttributes(30, 100, 40, -30, 20, 80, 10);
    hamster.setAttributes(40, 70, 31, 20, 20, 5, 1);
    tsunami.setDestructionLevel(50); tsunami.setDuration(5);
    earthquake.setDestructionLevel(50); earthquake.setDuration(5);

    while(f==1){
        hamster.drown(); hamster.environmentAffects(); hamster.reproduce(); hamster.wars(); hamster.destroyCrops(); 
        people.affectEnvironment(); people.drown(); people.makeSoilFertile(); people.becomeSmarter();
        weapon.produceWeapons(people.getAmount());
        if (Ground.soilFertility>0)
            people.reproduce();
            else
            people.reproduce(100); 
        int weaponsLost=people.wars(weapon.getWeaponAmount(),weapon.getDestructionLevel());  people.produceFood(); weapon.reduceWeapons(weaponsLost);
        shark.drown(); shark.environmentAffects(); shark.reproduce(); shark.wars(); 
        System.out.print("\033[H\033[2J");
        System.out.println("Year:"+year);
        year+=1;
        people.environmentAffects();
        if (people.getIntelligence()>=1000)
            weapon.setDestructionLevel( (float) ((people.getIntelligence()*people.getAmount()*0.0001)/(people.getIntelligence()/1000)));
        else weapon.setDestructionLevel( (float) (people.getIntelligence()*people.getAmount()*0.0001));
        if (tsunami.probabilityOfCalamity()==1){
            tsunami.modifyWaterAmount();
            System.out.println("A tsunami took place!");            //tsunami
        } else { if (earthquake.probabilityOfCalamity()==1) {
                earthquake.modifySoilandTemp();
                System.out.println("An earthquake took place!");   //earthquake
                if (tsunami.probabilityOfCalamity(8)==1){
                    tsunami.modifyWaterAmount();
                    System.out.println("The earthquake caused a tsunami!");  //tsunami caused by earthquake
                }
            }
        }

        System.out.println("World humidity="+World.humidity+"%");
        System.out.println("World temperature="+World.temperature+"C");
        System.out.println("Soil fertility="+Ground.soilFertility+"%");
        System.out.println("Water amount="+Ground.waterAmount+"%");
        System.out.println("Total people:"+people.getAmount());
        System.out.println("People intelligence:"+people.getIntelligence());
        System.out.println("People evilness:"+people.getEvilness());
        System.out.println("Food produced:"+people.getFoodProduced()+"T");
        System.out.println("Weapons produced:"+weapon.getWeaponAmount());
        System.out.println("Weapons destruction level:"+weapon.getDestructionLevel());
        System.out.println("Total sharks:"+shark.getAmount());
        System.out.println("Total rats:"+hamster.getAmount());
        wait(1500);
    }
    }



    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
}
}
