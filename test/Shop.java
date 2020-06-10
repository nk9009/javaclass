package test;

public class Shop {
	
	private String name; 
	private int phone, tv, computer, sum; // 필드
	
	public void setName(String name) { // 쓰기. void: return이 없다는 기호. 바깥에 노출 안함 
		this.name = name; 
	}
	public String getName() { // 읽기. ():read only. 내용 변형왜곡 불가하게끔
		return this.name; // 읽으려면 저장된 데이터를 가져와야 하므로 get쓸땐  return. 바깥에 노출함
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
		System.out.println(name + "님이 결재하실 총 금액은 " + sum + "만원 입니다.");
	}
}

