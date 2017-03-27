package niceMan.model.dto;

public class People implements Comparable<People>{
	private String name;//이름
	private int count; //누적 횟수
	

	public People() {}
	
	public People(String name) {
		this.name = name;
		this.count = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("이름 : ");
		builder.append(name);
		builder.append(", 누적 횟수 : ");
		builder.append(count);
		return builder.toString();
	}
	
	public int compareTo(People people) {
		if (this.count < people.count) {
			return 1;
		} else if (this.count == people.count) {
			return 0;
		} else {
			return -1;
		}
	}

}
