package race;

public class Player {
	private String name;
	private int record;
	
	public void setName(String name) { // name은 밤색인데 scanner로 들어온 값이 들어옴
		this.name = name; // 여기서 this에 해당하는 건 name, record밖에 없음
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
		System.out.println("선수: " + name + ", 기록: " + record +"초");
	}
}	