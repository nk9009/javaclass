package test;
import java.util.Scanner; 

public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Shop[] arr = new Shop[3];
		for(int i = 0; i < arr.length; i++) { 
			Shop shop = new Shop();
			System.out.println("�̸�: ");
			shop.setName(scanner.next());  
			System.out.println("�� ����: ");
			shop.setPhone(scanner.nextInt());
			System.out.println("TV ����: ");
			shop.setTv(scanner.nextInt());
			System.out.println("��ǻ�� ����: ");
			shop.setComputer(scanner.nextInt());
			shop.sum();
			arr[i] = shop;
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].printStates();
		}
	}
}