package test;

public class Student {
	
	private String name; // 정보 은닉, 캡슐화
	private int kor, eng, math, sum; // 필드
	float avg;
	
	public void setName(String name) { // 쓰기. void: return이 없다는 기호. 바깥에 노출 안함 
		this.name = name; 
	}
	public String getName() { // 읽기. ():read only. 내용 변형왜곡 불가하게끔
		return this.name; // 읽으려면 저장된 데이터를 가져와야 하므로 get쓸땐  return. 바깥에 노출함
	}
	public void setKor(int kor) { // 국어
		this.kor = kor;
	} 
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) { // 영어
		this.eng = eng;
	} 	
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) { // 수학
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
				"이름: " + name + ", 국어: " + kor + ", 영어: " + eng + ", 수학: " + math + ", 총점: " + sum + ", 평균: " + avg );
	}
}