package race;

public class Player {
	private String name;
	private int record;
	
	public void setName(String name) { // name�� ����ε� scanner�� ���� ���� ����
		this.name = name; // ���⼭ this�� �ش��ϴ� �� name, record�ۿ� ����
	}
	public String getName() {
		return this.name;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public int getRecord() {
		return this.record;
	}
	
	public void showRecord() {
		System.out.println("����: " + name + ", ���: " + record +"��");
	}
}	