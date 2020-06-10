package race;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] players = new Player[3]; // 참가번호 0,1,2
		for(int i = 0; i < players.length; i++) {
			Player player = new Player();
			System.out.println("이름: ");
			String name = scanner.next();
			player.setName(name);
			System.out.println("100M 기록: ");
			int time = scanner.nextInt();
			player.setRecord(time);
			players[i] = player;
		}

		for(int i = 0; i < players.length; i++) {
			players[i].showRecord();
		}	
		
		Player[] ranking = new Player[3]; // ranking 기록에 의한 순서
		if(players[0].getRecord() < players[1].getRecord()) {
			if(players[0].getRecord() < players[2].getRecord()) {
				ranking[0] = players[0];
			} else {
				ranking[0] = players[2];
			}	
		}else {
			if(players[1].getRecord()<players[2].getRecord()) {
				ranking[0] = players[1];
			}else {
				ranking[0] = players[2];
			}
		}
		System.out.println("1등은 " + ranking[0].getName());
	}
}

