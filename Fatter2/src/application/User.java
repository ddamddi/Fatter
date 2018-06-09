package application;

public class User {
	private String u_id;
	private String password;
	private String sex;
	private float height;
	private float weight;
	private float firstWeight;
	private int age;
	private float BMR;
	/*
	public void getUserInfo() {	// dbModule�� ����ϴ� getter �Լ�
		LoginModule loginModule;
		DBModule dbModule;
		if (loginModule.compareIDPassword()) {	// �Է� ���̵�� ����� DB�� ��ġ�� 
			dbModule.getUserDBInfo(this);
		}
	}*/
	
	public void setUserInfoFirst(String u_id,String password,String Sex, float Height, float Weight, int Age,float firstWeight) {	// ������� �Է��� �޾� �����ϴ� setter �Լ�
		this.u_id = u_id;
		this.password = password;
		this.sex = Sex;
		this.height = Height;
		this.weight = Weight;
		this.age = Age;
		this.firstWeight=firstWeight;
	}
	public void setUserInfo(String u_id,String password,String Sex, float Height, float Weight, int Age) {	// ������� �Է��� �޾� �����ϴ� setter �Լ�
		this.u_id = u_id;
		this.password = password;
		this.sex = Sex;
		this.height = Height;
		this.weight = Weight;
		this.age = Age;
		
	}
	
	public String getId() {
		return this.u_id;
	}
	public String getPW() {
		return this.password;
	}
	public float getHeight() {
		return this.height;
	}
	public float getWeight() {
		return this.weight;
	}
	public float getFirstWeight() {
		return this.firstWeight;
	}
	public String getSex() {
		return this.sex;
	}
	public int getAge() {
		return this.age;
	}
	public float getBMR(){
		return this.BMR;
	}
}