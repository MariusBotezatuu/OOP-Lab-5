package Classes;
import java.util.Random;
abstract class Organisms extends Entity{
    protected int minHumidityRequired,minTempRequired,amount,evilness,maxHumidity,maxTemperature,intelligence;

    public void setAttributes(int minHumidityRequired,int maxHumidity,int maxTemperature,int minTempRequired,int amount,int evilness,int intelligence){
        this.amount=amount;
        this.minHumidityRequired=minHumidityRequired;
        this.minTempRequired=minTempRequired;
        this.maxHumidity=maxHumidity;
        this.maxTemperature=maxTemperature;
        this.evilness=evilness;
        this.intelligence=intelligence;
    }

    public int getAmount(){
        return amount;
    }

    public void environmentAffects(){
        if (World.humidity<minHumidityRequired)
            amount-=(minHumidityRequired-World.humidity)*amount;
        if (World.temperature<minTempRequired)
            amount-=(minTempRequired-World.temperature)*amount;
        if (World.humidity>maxHumidity)
            amount-=(World.humidity-maxHumidity)*amount;
        if (World.temperature>maxTemperature)
            amount-=(World.temperature-maxTemperature)*amount;

        if (amount<0)
            amount=0;
    }

    public void wars(){
        if (amount>1)
            amount-=0.001*evilness*amount; //kill each other
    }

    public void reproduce(){
        int amount1=amount/2;
        for (int i=0;i<amount1;i++){  //reproduce
            Random rd = new Random(); 
            if (rd.nextBoolean()==true)
                amount+=1; 
        }
    }

    public void drown(){
        if (Ground.waterAmount==100||Ground.waterAmount==0)  //drown    
            amount=0;
    }

}
