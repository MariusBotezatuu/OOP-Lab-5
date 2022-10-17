package Classes;
abstract class DetrimentalThings extends Entity{
    protected int destructionLevel;

    public void setDestructionLevel(int destructionLevel){
        this.destructionLevel=destructionLevel;
    }

    public int getDestructionLevel(){
        return destructionLevel;
    }
    
}
