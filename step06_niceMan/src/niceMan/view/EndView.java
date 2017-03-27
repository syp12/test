package niceMan.view;

import java.util.ArrayList;
import java.util.Scanner;

import niceMan.model.dto.People;

public class EndView {

	//1. 전체 객체 조회
	public static void all(ArrayList<People> peopleAll) {
		System.out.println("-----------------------전체 인원 조회-------------------");
		if(peopleAll.size()==0)
			System.out.println("등록된 사용자가 없습니다.");
		for(int i=0; i<peopleAll.size(); i++){
			if(peopleAll.get(i)!=null)
				System.out.println((i+1) + ". " + peopleAll.get(i).getName());
		}
		System.out.println("---------------------------------------------------");
	}
	//2. 객체 추가
	public static void setPeople(ArrayList<People> peopleList) {
		System.out.println("-----------------------등록 결과----------------------");
		System.out.println("등록되었습니다.");
		for(int i=0; i<peopleList.size(); i++){
			if(peopleList.get(i)!=null)
				System.out.println((i+1) + ". " + peopleList.get(i).toString());
		}
		System.out.println("---------------------------------------------------");
	}
	//6. 시작하기
	public static void rand(People peopleRand) {
		Scanner sc = new Scanner(System.in);
		if(peopleRand!=null){
			System.out.print("어떤 종목?: ");
			String product = sc.next();
			System.out.println("------------------------결과------------------------");
			System.out.println(product+"의 대인배는 " +
			peopleRand.getName());
			//System.out.println("현재 누적" + peopleRand.getCount());
			System.out.println("---------------------------------------------------");
		}
	}
	public static void init(ArrayList<People> peopleAll) {
		System.out.println("-----------------------전체 인원 초기화-------------------");
		if(peopleAll.size()==0)
			System.out.println("등록된 사용자가 없습니다.");
		else{
			peopleAll.clear();
			System.out.println("초기화 완료되었습니다.");
		}
		
		System.out.println("---------------------------------------------------");
	}
	public static void rank(ArrayList<People> peopleRank) {
		System.out.println("-----------------------전체 순위 조회-------------------");
		System.out.println("순위     이름        누적");
		System.out.println("---------------------------------------------------");
		if(peopleRank.size()==0)
			System.out.println("등록된 사용자가 없습니다.");
		for(int i=0; i<peopleRank.size(); i++){
			if(peopleRank.get(i)!=null)
				System.out.println(" "+ (i+1) + ".  " + peopleRank.get(i).getName() +"    " + peopleRank.get(i).getCount());
		}
		System.out.println("---------------------------------------------------");
	}

	



}
