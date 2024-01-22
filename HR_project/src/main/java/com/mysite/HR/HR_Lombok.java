package com.mysite.HR;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
//import lombok.Setter;


@Getter
//@Setter
@RequiredArgsConstructor	// 생성자 자동으로 만들어줌
public class HR_Lombok {
	// final 없으면 생성자로 포함되지 않으므로 꼭 써줘야.
	private final String str1;
	private final int int1;
	
	public static void main(String[] args) {
//		HRLombok lombok1 = new HRLombok();
//		lombok1.setStr1("첫번째는 문자열");
//		lombok1.setInt1(2);
		
		HR_Lombok lombok1 = new HR_Lombok("첫번째는 문자열", 2);
		
		System.out.println(lombok1.getStr1());
		System.out.println(lombok1.getInt1());
		
	}
}
