package race;

public class Player {
	private String name; // 인스턴스 변수는 초기화하지 않고 로컬 변수는 반드시 초기화 해야 한다
	private int record;
	
	public void setName(String name) { 
		this.name = name; 
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
		System.out.println("이름: " + name + ", 기록: " + record +"초");
	}
}	