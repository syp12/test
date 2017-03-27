package niceMan.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import niceMan.model.dto.People;

public class DataUseService {
	
private static DataUseService instance = new DataUseService();
	
	private static ArrayList<People> peopleList = new ArrayList<People>();

	private DataUseService(){}
	
	public static DataUseService getInstance(){
		return instance;
	}
	
	//1. People ��ü ��ü ��ȸ, 5. �ʱ�ȭ
		public static ArrayList peopleAll() {
			return peopleList;
		}
	
	//2. People �߰�
	public static ArrayList peopleInsert() {
		Scanner sc = new Scanner(System.in);
		String name;
	
		System.out.print("�ο� ��: ");
		int peopleNum = sc.nextInt();	//�� �ο� �� �Է�
		
		for(int i=0; i<peopleNum; i++){
			System.out.print((i+1) + ". �̸�: ");
			name = sc.next();	//�̸� �Է�
			People p = new People(name);	//people ��ü ����
			peopleList.add(p);	//list �߰�
		}
		return peopleList;
	}

	//6. �����ϱ�
	public static People peopleRand() {
		try{
			int randNum = (int)(Math.random()*peopleList.size());
			People p = peopleList.get(randNum);
			p.setCount(p.getCount()+1);
			return p;
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("����ڰ� ��ϵ��� �ʾ� ���α׷��� ������ �� �����ϴ�.");
			return null;
		}
	}

	public static ArrayList peopleRank() {
		Collections.sort(peopleList);
		return peopleList;
	}

	public static ArrayList<People> peopleName(String name, String newName) {
		boolean chk = false;
		for(int i=0; i<peopleList.size(); i++)
		{
			if(peopleList.get(i).getName().equals(name)){
				peopleList.get(i).setName(newName);
				System.out.println("�̸��� ����Ǿ����ϴ�.");
				chk = true;
			}
		}
		if(chk == false)
			System.out.println("�ش� �̸��� ����ڰ� �������� �ʽ��ϴ�.");
		return peopleList;
	}

	public static People peopleRich(String name) {
		try{
			People p = new People();
			for(int i=0; i<peopleList.size(); i++)
			{
				if(peopleList.get(i).getName().equals(name))
				p = peopleList.get(i);
			}
			return p;
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("����ڰ� ��ϵ��� �ʾ� ���α׷��� ������ �� �����ϴ�.");
			return null;
		}

	}
}
