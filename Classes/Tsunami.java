package Classes;
public class Tsunami extends NaturalCalamities{
    
    public void modifyWaterAmount(){
        Ground.waterAmount+=(float)(0.01*duration*destructionLevel);
        World.humidity+=0.01*duration*destructionLevel;
        if (Ground.waterAmount>100)
            Ground.waterAmount=100;
        if (World.humidity>100)
            World.humidity=100;
    }

   
}
