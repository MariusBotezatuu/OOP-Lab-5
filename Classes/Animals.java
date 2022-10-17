package Classes;
abstract class Animals extends Organisms{
    protected String nutritionType;

    public void setNutritionType(String nutritionType){
        this.nutritionType=nutritionType;
    }

    public String getNutritionType(){
        return nutritionType;
    }

}
