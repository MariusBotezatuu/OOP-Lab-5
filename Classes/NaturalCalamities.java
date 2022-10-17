package Classes;
abstract class NaturalCalamities extends DetrimentalThings{
    protected int duration;

    public void setDuration(int duration){
        this.duration=duration;
    }

    public int getDuration(){
        return duration;
    }

    public int probabilityOfCalamity(){
        int x;
        x=1 + (int)(Math.random() * ((12 - 1) + 1));  //[1,12]
        return x;
    }

    public int probabilityOfCalamity(int i){
        int x;
        x=1 + (int)(Math.random() * ((i - 1) + 1));  //[1,i]
        return x;
    }
    
    
}
