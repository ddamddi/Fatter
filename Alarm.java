package fattar;

public class Alarm {
	private Time eatTime;
	
	public void getEatTimeDB() {			// getEatTimeDB()�� ���� DB�� ����Ǿ� �ִ� ���� �ֱ��� �Ļ� ���� �����´�.
		DBModule dbModule;
		dbModule.getEatenDBinfro()
	}
	public void setAlarmTime(Time time) {	// ������ �Ļ��� �ð� �������� 6�ð� ���ĸ� �Ļ� ����ð����� ����, �ش� �ð��� Time �������� ��ȯ
		this.eatTime = time;
	}	
	public void startAlarm() {				// JAVA Thred�� ����� �Ļ� ���� �ð��� �Ǿ����� �Ǵ��ϰ�, �Ҹ��� ���
		
	}
	public void stopAlarm() {				//  ������ �˶��� ���� ����Ǹ�, thread�� ���� ��Ų��.
		
	}
}
