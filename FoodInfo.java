
public class FoodInfo {

 private	String UserID;
	
 private	String data;
	
 private	int foodID;
	
 private	String foodName;
	
 private	double[] foodNutrient;
 
 FoodInfo(){
 }
//Ŭ������ ������ �����ϰų� ���� �������� ���� �Լ���
public int getFoodID() {
	return foodID;
}

public void setFoodID(int foodID) {
	this.foodID = foodID;
}

public String getFoodName() {
	return foodName;
}

public void setFoodName(String foodName) {
	this.foodName = foodName;
}

public double getFoodNutrient() {
	return foodNutrient;
}

public void setFoodNutrient(double foodNutrient) {
	this.foodNutrient = foodNutrient;
}
 

	 
 }
}
