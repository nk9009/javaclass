package test;

public class Student {
	
	private String name; // ���� ����, ĸ��ȭ
	private int kor, eng, math, sum; // �ʵ�
	float avg;
	
	public void setName(String name) { // ����. void: return�� ���ٴ� ��ȣ. �ٱ��� ���� ���� 
		this.name = name; 
	}
	public String getName() { // �б�. ():read only. ���� �����ְ� �Ұ��ϰԲ�
		return this.name; // �������� ����� �����͸� �����;� �ϹǷ� get����  return. �ٱ��� ������
	}
	public void setKor(int kor) { // ����
		this.kor = kor;
	} 
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) { // ����
		this.eng = eng;
	} 	
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) { // ����
		this.math = math;
	} 
	public int getMath() {
		return this.math;
	}
	public void sum() {
		this.sum = this.kor + this.eng + this.math;  
	}
	public void avg() {
		this.avg = this.sum / 3;
	}
	
	void printStates() { 
		System.out.println(
				"�̸�: " + name + ", ����: " + kor + ", ����: " + eng + ", ����: " + math + ", ����: " + sum + ", ���: " + avg );
	}
}