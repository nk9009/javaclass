package test;

public class Shop {
	
	private String name; 
	private int phone, tv, computer, sum; // �ʵ�
	
	public void setName(String name) { // ����. void: return�� ���ٴ� ��ȣ. �ٱ��� ���� ���� 
		this.name = name; 
	}
	public String getName() { // �б�. ():read only. ���� �����ְ� �Ұ��ϰԲ�
		return this.name; // �������� ����� �����͸� �����;� �ϹǷ� get����  return. �ٱ��� ������
	}
	public void setPhone(int phone) { 
		this.phone = phone;
	} 
	public int getPhone() {
		return this.phone;
	}
	public void setTv(int tv) {
		this.tv = tv;
	} 	
	public int getTv() {
		return this.tv;
	}
	public void setComputer(int computer) {
		this.computer = computer;
	} 
	public int getComputer() {
		return this.computer;
	}
	public void sum() {
		this.sum = this.phone + this.tv + this.computer;  
	}
	
	void printStates() { 
		System.out.println(name + "���� �����Ͻ� �� �ݾ��� " + sum + "���� �Դϴ�.");
	}
}

