package Classes;
import java.util.Random;
public class Rats extends Animals{

    public void reproduce(){
        int amount1=amount;
        for (int i=0;i<amount1;i++){  //reproduce
            Random rd = new Random(); 
            if (rd.nextBoolean()==true)
                amount+=1; 
        }
    }

    public void wars(){
        if (amount > 2)
            amount-=0.0000001*evilness*amount; //kill each other
    }

    public void destroyCrops(){
        Ground.soilFertility-=0.001*amount;
    }
    
}
