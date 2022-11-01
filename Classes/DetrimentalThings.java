package Classes;
abstract class DetrimentalThings extends Entity{
    protected float destructionLevel;

    public void setDestructionLevel(float destructionLevel){
        this.destructionLevel=destructionLevel;
    }

    public float getDestructionLevel(){
        return destructionLevel;
    }
    
}
