package niceMan.view;

import java.util.ArrayList;
import java.util.Scanner;

import niceMan.model.dto.People;

public class EndView {

	//1. ��ü ��ü ��ȸ
	public static void all(ArrayList<People> peopleAll) {
		System.out.println("-----------------------��ü �ο� ��ȸ-------------------");
		if(peopleAll.size()==0)
			System.out.println("��ϵ� ����ڰ� �����ϴ�.");
		for(int i=0; i<peopleAll.size(); i++){
			if(peopleAll.get(i)!=null)
				System.out.println((i+1) + ". " + peopleAll.get(i).getName());
		}
		System.out.println("---------------------------------------------------");
	}
	//2. ��ü �߰�
	public static void setPeople(ArrayList<People> peopleList) {
		System.out.println("-----------------------��� ���----------------------");
		System.out.println("��ϵǾ����ϴ�.");
		for(int i=0; i<peopleList.size(); i++){
			if(peopleList.get(i)!=null)
				System.out.println((i+1) + ". " + peopleList.get(i).toString());
		}
		System.out.println("---------------------------------------------------");
	}
	//6. �����ϱ�
	public static void rand(People peopleRand) {
		Scanner sc = new Scanner(System.in);
		if(peopleRand!=null){
			System.out.print("� ����?: ");
			String product = sc.next();
			System.out.println("------------------------���------------------------");
			System.out.println(product+"�� ���ι�� " +
			peopleRand.getName());
			//System.out.println("���� ����" + peopleRand.getCount());
			System.out.println("---------------------------------------------------");
		}
	}
	public static void init(ArrayList<People> peopleAll) {
		System.out.println("-----------------------��ü �ο� �ʱ�ȭ-------------------");
		if(peopleAll.size()==0)
			System.out.println("��ϵ� ����ڰ� �����ϴ�.");
		else{
			peopleAll.clear();
			System.out.println("�ʱ�ȭ �Ϸ�Ǿ����ϴ�.");
		}
		
		System.out.println("---------------------------------------------------");
	}
	public static void rank(ArrayList<People> peopleRank) {
		System.out.println("-----------------------��ü ���� ��ȸ-------------------");
		System.out.println("����     �̸�        ����");
		System.out.println("---------------------------------------------------");
		if(peopleRank.size()==0)
			System.out.println("��ϵ� ����ڰ� �����ϴ�.");
		for(int i=0; i<peopleRank.size(); i++){
			if(peopleRank.get(i)!=null)
				System.out.println(" "+ (i+1) + ".  " + peopleRank.get(i).getName() +"    " + peopleRank.get(i).getCount());
		}
		System.out.println("---------------------------------------------------");
	}

	



}
