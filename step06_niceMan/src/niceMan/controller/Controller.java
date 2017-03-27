package niceMan.controller;

import java.util.ArrayList;
import java.util.Scanner;

import niceMan.model.DataUseService;
import niceMan.model.dto.People;
import niceMan.view.EndView;

public class Controller {
	//인원 추가
	public static void setPeople() {
		EndView.setPeople(DataUseService.peopleInsert());		
	}
	
	//전체 인원 조회
	public static void all() {
		EndView.all(DataUseService.peopleAll());		
	}

	public static void randPeople() {
		EndView.rand(DataUseService.peopleRand());
	}
	
	public static void richPeople(String name) {
		EndView.rand(DataUseService.peopleRich(name));
	}

	public static void initialization() {
		EndView.init(DataUseService.peopleAll());
	}

	public static void rankView() {
		EndView.rank(DataUseService.peopleRank());
	}

	public static void changeName(String name, String newName) {
		EndView.all(DataUseService.peopleName(name, newName));
	}
}
