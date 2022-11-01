package Classes;
import java.util.Random;
public class Sharks extends Animals{

    public void drown(){
        if (Ground.waterAmount==0)
            amount=0;
    }

    public void reproduce(){
        int amount1;
        if (amount<Ground.waterAmount*10000){
            if (amount>=5)
                amount1=amount/5;
            else amount1=amount/2;
            for (int i=0;i<amount1;i++){  //reproduce
                Random rd = new Random(); 
                if (rd.nextBoolean()==true)
                    amount+=1; 
            }
        }
    }

    public void wars(){
        if (amount>2)
            amount-=0.00001*evilness*amount; //kill each other
    }
}
