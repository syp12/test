package niceMan.view;

import java.util.Scanner;

import niceMan.controller.Controller;

public class StartView {

	public static String startMenu(){
		String option;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******************���ι� �̱� ������Ʈ*******************");
		System.out.println("1. ���� �ο� ��ȸ");	//��ü ��ü ��ȸ
		System.out.println("2. ���� �ο� �߰�");	//��ü ����
		System.out.println("3. ������ �̸� ����");	//�̸� ����
		System.out.println("4. ���� ��ŷ ��ȸ");	//���� ��ũ ��ȸ(�󸶳� �ɷȴ���)
		System.out.println("5. �ʱ�ȭ");//��ü ����
		System.out.println("6. �����ϱ�");	//��� ������
		System.out.println("7. ������");	//��� ������
		System.out.println("***************************************************");
		System.out.print("=> �ɼ� ����: ");
		option = sc.next();
		
		
		return option;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		String start;
		String name;
		String newName;
		String richName;
		
		while(check == true){
			String option;
			//���۸޴�
			option = startMenu();
			
			
			switch(option){
				//1. ���� �ο� ��ü ��ȸ
				case "1":
					Controller.all();
					break;
				//2. ���� �ο� �߰�
				case "2": 
					Controller.setPeople();
					break;
				//3. �̸� ����
				case "3": 
					System.out.print("������ �̸�: ");
					name = sc.next();
					System.out.print("������ �̸�: ");
					newName = sc.next();
					Controller.changeName(name, newName);
					break;
				//4. ��ŷ ��ȸ
				case "4": 
					Controller.rankView();
					break;
				//5. ����Ʈ �ʱ�ȭ
				case "5": 
					Controller.initialization();
					break;
				//6. �����ϱ�
				case "6": 
					System.out.print("�����Ͻðڽ��ϱ�??(y/n): ");
					start = sc.next();
					if(start.equals("y")){
						Controller.randPeople();
					}
					else if(start.equals("n"))
						break;
					else if(start.equals("secret"))
					{
						System.out.print("����� �����ϴ� ���ι��??: ");
						richName = sc.next();
						Controller.richPeople(richName);
					}
					else
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				//7. ������
				case "7": 
					check = false; 
					System.out.println("���α׷��� ��Ĩ�ϴ�.");
					break;
				default:
					System.out.println("�ش� �ɼ��� �����ϴ�.");
			}
		}
	}

}
