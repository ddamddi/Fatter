import java.util.Scanner;
import java.io.File
import java.io.FileInputStream;
import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.io.serializable
import java.text.SimpleDateFormat;
import java.util.Date;
public class DBModule {
private FoodInfo eatenInfo;
private FoodInfo foodInfo;
private double[] actInfo;// �ൿ�� ������ ���� ��ġ�̱� ������ �迭�� index������ �ൿ�� ������ ����
private String foodName;
private User user;
private String date;
private FatterMath math;


DBModule(){//constructor
	
	FileInputStream fired = new FileInputStream("foodDB");
	if(fired.read()== -1) {//������ �� Ǫ�� DB�� ����ִ��� Ȯ�� ����ִٸ�,
		Crawling crawl = new Crawling; //ũ�Ѹ� ��� ����
		crawl.connectURL(); // Ȩ������ ����
		crawl.getFoodInfo(fired);//��DB���� ũ�Ѹ��� ���� ���� �������� ���� DB�� ����
	
	
	}
	else {
	}//�̹� �������� �ִ� ��� ����
	fired.close();
}

public void setUserDBInfo(User user) {
	FileOutputStream userfile = new FileOutPutStream("userDB");
	ObjectOutputStream d_stream = new ObjectOutputStream(userfile);//�����ͺ��̽� ����
	wrt.write();//������ ���Ŀ� ���� db��  �Է�
	userfile.close();
}//���� Ŭ�����ȿ��� setUserInfo �Լ� �ȿ��� ����� �Լ��� �Ķ���ͷ�  ȸ������ �� �Էµ� ������ ����� User Ŭ������ �޾� �������� DB�� ����Ѵ�.

public void getUserDBInfo(String u_id,User user ) {
	
	FileInputStream fred = new FileInputStream("userDB");
	DBModule.search(u_id);//search �Լ��� ���� id�� ��ġ�ϴ� ���ڵ� �˻�
	String arr = fred.read();//��ġ�ϴ� ���� ���� ������
	arr.split(":");
	for(int i = 0; i< arr.length(); i++) {
	user.info = arr[i];// �´� ������ ������� �Ľ��Ͽ� ����
	}
	fred.close();
}

public void setFoodDBInfo() {
	FileOutputStream foodFile = new FileOutPutStream("foodDB");
	ObjectOutputStream d_stream = new ObjectOutputStream(foodFile);//�����ͺ��̽� ����
	
	wrt.write();//������ ���Ŀ� ���� db��  �Է�
}// �������� �Է¹��� ������ ������ ���� db�� ����

public void getFoodDBInfo(String foodName) {
	FileInputStream fred = new FileInputStream("foodDB");
	DBModule.search(foodname);//search �Լ��� ���� �����̸��� ��ġ�ϴ� ���ڵ� �˻�
	String arr = fred.read();//��ġ�ϴ� ���� ���� ������
	arr.split(":");
	for(int i = 0; i< arr.length(); i++) {
	foodInfo.info = arr[i];// �´� ������ ������� �Ľ��Ͽ� ����
	}
	fred.close();
}
public void setActDBInfo(double[] act) {
	FileOutputStream actFile = new FileOutPutStream("ActDB");
	//�����ͺ��̽� ����
	
	wrt.write();//������ ���Ŀ� ���� db��  �Է�
}// �������� �Է¹���  ��� ������ � db�� ����

public void getActDBInfo(String actName) {
	FileInputStream fred = new FileInputStream("ActDB");
	DBModule.search(actName);//search �Լ��� ���� ��� �̸��� ��ġ�ϴ� ���ڵ� �˻�
	String arr = fred.read();//��ġ�ϴ� � ���� ������
	arr.split(":");
	for(int i = 0; i< arr.length(); i++) {
	actInfo.info = (double)arr[i];// �´� ������ ������� �Ľ��Ͽ� ����
	}
	fred.close();
}

public void setEatenDBInfo() {
	FileOutputStream EatenfoodFile = new FileOutPutStream("EatenfoodDB");
	ObjectOutputStream d_stream = new ObjectOutputStream(EatenfoodFile);//�����ͺ��̽� ����
	if(math.evaluateEatenFood(eatenInfo))// ���� ���� ������ ���ؿ� ���� �ʴ��� Ȯ��
	wrt.write();//���ؿ� ������ ������ ���Ŀ� ���� db��  �Է�
}// �������� �Է¹��� ������ ������ ���� db�� ����

public void getEatenDBInfo(String foodName) {
	FileInputStream fred = new FileInputStream("EatenfoodDB");
	while(String arr = fred.read())//���� ���� �ٴ��������� ���� ���� ������
	
	arr.split(":");
	for(int i = 0; i< arr.length(); i++) {
	EatenInfo.info = arr[i];// �´� ������ ������� �Ľ��Ͽ� ����
	}
	print(math.totalNutrient());// ���� ������ �� ���簡 ��� �� ���
	fred.close();
}//���� ���� ������ �������� ������

public void search(String name) {

}// �̸��� ��ġ�ϴ� ������ ���� �׸��� DB�ȿ� �ִ� �� �˻��ϰ� �� ��ġ�� ����


	
}//���� Ŭ���� �ȿ��� getUsesrInfo �Լ��ȿ��� ���̴� �Լ��� id�� ��ġ�ϴ� ���ڵ带 ������ ���̽� �ȿ��� ã�� �̸�  
	public static void main(String[] args) {//unit test �� ���� �Լ�
		
	}

}
