package niceMan.view;

import java.util.Scanner;

import niceMan.controller.Controller;

public class StartView {

	public static String startMenu(){
		String option;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******************대인배 뽑기 프로젝트*******************");
		System.out.println("1. 참여 인원 조회");	//전체 객체 조회
		System.out.println("2. 참여 인원 추가");	//객체 생성
		System.out.println("3. 참여자 이름 변경");	//이름 수정
		System.out.println("4. 누적 랭킹 조회");	//누적 랭크 조회(얼마나 걸렸는지)
		System.out.println("5. 초기화");//객체 삭제
		System.out.println("6. 시작하기");	//결과 보여줌
		System.out.println("7. 끝내기");	//결과 보여줌
		System.out.println("***************************************************");
		System.out.print("=> 옵션 선택: ");
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
			//시작메뉴
			option = startMenu();
			
			
			switch(option){
				//1. 참여 인원 전체 조회
				case "1":
					Controller.all();
					break;
				//2. 참여 인원 추가
				case "2": 
					Controller.setPeople();
					break;
				//3. 이름 변경
				case "3": 
					System.out.print("변경전 이름: ");
					name = sc.next();
					System.out.print("변경후 이름: ");
					newName = sc.next();
					Controller.changeName(name, newName);
					break;
				//4. 랭킹 조회
				case "4": 
					Controller.rankView();
					break;
				//5. 리스트 초기화
				case "5": 
					Controller.initialization();
					break;
				//6. 시작하기
				case "6": 
					System.out.print("시작하시겠습니까??(y/n): ");
					start = sc.next();
					if(start.equals("y")){
						Controller.randPeople();
					}
					else if(start.equals("n"))
						break;
					else if(start.equals("secret"))
					{
						System.out.print("당신이 생각하는 대인배는??: ");
						richName = sc.next();
						Controller.richPeople(richName);
					}
					else
						System.out.println("잘못 입력하셨습니다.");
					break;
				//7. 끝내기
				case "7": 
					check = false; 
					System.out.println("프로그램을 마칩니다.");
					break;
				default:
					System.out.println("해당 옵션이 없습니다.");
			}
		}
	}

}
