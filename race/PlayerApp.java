package race;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] players = new Player[3]; // ������ȣ 0,1,2
		for(int i = 0; i < players.length; i++) {
			Player player = new Player();
			System.out.println("�̸�: ");
			String name = scanner.next();
			player.setName(name);
			System.out.println("100M ���: ");
			int time = scanner.nextInt();
			player.setRecord(time);
			players[i] = player;
		}

		for(int i = 0; i < players.length; i++) {
			players[i].showRecord();
		}	
		
		Player[] ranking = new Player[3]; // ranking ��Ͽ� ���� ����
		if(players[0].getRecord() < players[1].getRecord()) {
			System.out.println(players[0].getName()
					+"�� "
					+players[1].getName()+"���� ������");
		} else {
			System.out.println(players[1].getName() 
					+"�� "
					+players[0].getName()+"���� ������");
		}
	}
}
/**
 
 */

