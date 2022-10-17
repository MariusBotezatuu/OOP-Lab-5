package Classes;
public class Weapons extends DetrimentalThings{
    protected int weaponAmount;

    public void produceWeapons(int peopleamount){
        weaponAmount+=peopleamount/1000;
    }

    public int getWeaponAmount(){
        return weaponAmount;
    }

}
