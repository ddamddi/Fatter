package application;

public class FoodInfo {//������ ������ �����ϱ� ���� Ŭ����

	private	String foodName;

	private	String kcal;

	private	String protein;

	private	String fat;

	private	String catbo;

	

	FoodInfo(){//constructor

	}

 

	//Ŭ������ ������ �����ϰų� ���� �������� ���� �Լ���

	public String getFoodName() {

		return this.foodName;

	}

 

	public String getKcal() {

		return this.kcal;

	}

 

	public String getProtein() {

		return this.protein;

	}

 

	public String getFat() {

		return this.fat;

	}

 

	public String getCatbo() {

		return this.catbo;

	}

 

 

	public void setFoodName(String foodName) {

		this.foodName = foodName;

	}

	public void setKcal(String kcal) {

		this.kcal = kcal;

	}

	public void setProtein(String protein) {

		this.protein = protein;

	}

	public void setFat(String fat) {

		this.fat = fat;

	}

	public void setCatbo(String catbo) {

		this.catbo = catbo;

	}

}
