package com.mysite.HR.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "HR_mem")
public class HR_mem {
	@Id	// 기본키로 지정 (중복값 X)
	@Column(length = 7)
	private String EmployeeID;		// "1701001" 입사연도 2자리 + 부서코드 2자리 + 고유번호 3자리(001부터 순서대로)
	
	@Column(length = 5)
	private String Name;			// "김예은" VARCHAR(5)
	
	@Column(length = 10)
	private String StartDate;		// 2017-03-02 형식 DATE
	
	@Column(length = 5)
	private String DeptName;		// "인사팀" VARCHAR(5)
	
	@Column(length = 5)
	private String Position;		// "팀장" VARCHAR(5)
	
	@Column(length = 20)
	private String Email;			// "email001@naver.com" 형식. VARCHAR(20)
	
	private int RegularPay;		// NUMBER(20)
	
	private int BankNum;			// NUMBER(20)
	
	
	
	
	
}
