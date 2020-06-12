package member;

public interface MemberService {
	public void join(Member member); // ()괄호 안을 비우지 않음으로써 부를 수 있는 공간을 열어 줌
	public void login();
	public Member[] list();
	
	}

