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
	
	//1. People 객체 전체 조회, 5. 초기화
		public static ArrayList peopleAll() {
			return peopleList;
		}
	
	//2. People 추가
	public static ArrayList peopleInsert() {
		Scanner sc = new Scanner(System.in);
		String name;
	
		System.out.print("인원 수: ");
		int peopleNum = sc.nextInt();	//총 인원 수 입력
		
		for(int i=0; i<peopleNum; i++){
			System.out.print((i+1) + ". 이름: ");
			name = sc.next();	//이름 입력
			People p = new People(name);	//people 객체 생성
			peopleList.add(p);	//list 추가
		}
		return peopleList;
	}

	//6. 시작하기
	public static People peopleRand() {
		try{
			int randNum = (int)(Math.random()*peopleList.size());
			People p = peopleList.get(randNum);
			p.setCount(p.getCount()+1);
			return p;
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("사용자가 등록되지 않아 프로그램을 시작할 수 없습니다.");
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
				System.out.println("이름이 변경되었습니다.");
				chk = true;
			}
		}
		if(chk == false)
			System.out.println("해당 이름의 사용자가 존재하지 않습니다.");
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
			System.out.println("사용자가 등록되지 않아 프로그램을 시작할 수 없습니다.");
			return null;
		}

	}
}
