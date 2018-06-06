package fattar;

public class User {
	private String u_id;
	private String password;
	private boolean sex;
	private double height;
	private double weight;
	private int age;
	private double BMR;
	
	public void getUserInfo() {	// dbModule�� ����ϴ� getter �Լ�
		LoginModule loginModule;
		DBModule dbModule;

		if (loginModule.compareIDPassword()) {	// �Է� ���̵�� ����� DB�� ��ġ�� 
			dbModule.getUserDBInfo(this);
		}
	}
	
	public void setUserInfo(boolean Sex, double Height, double Weight, int Age) {	// ������� �Է��� �޾� �����ϴ� setter �Լ�
		this.sex = Sex;
		this.height = Height;
		this.weight = Weight;
		this.age = Age;
	}
	
	public double getBMR(){
		return this.BMR;
	}
}
