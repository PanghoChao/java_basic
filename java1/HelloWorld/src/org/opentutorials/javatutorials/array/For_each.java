package org.opentutorials.javatutorials.array;

public class For_each {
	public static void main(String[] args[]) {
			String[] members = {"박영찬", "이영호", "이충효", "이동규"};
			for (String e : members) { //members 안에 있는 요소를 한번씩 출력
				System.out.println(e + "이 상담을 받았습니다.");
			}// 자바5.0부터 도입된 기능
	}

}
