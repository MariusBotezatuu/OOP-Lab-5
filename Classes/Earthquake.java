package Classes;
public class Earthquake extends NaturalCalamities{
    public void modifySoilandTemp(){
        Ground.soilFertility-=0.01*duration*destructionLevel;
        World.temperature+=0.01*duration*destructionLevel;
        if (Ground.soilFertility<0)
            Ground.soilFertility=0;
    }
}
