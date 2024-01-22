package com.mysite.HR;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.HR.Entity.HR_mem;
import com.mysite.HR.Repository.HR_memRepository;

@SpringBootTest		// 스프링부트의 테스트 클래스임
class HrProjectApplicationTests {
	
	@Autowired		// 의존성 주입 : 스프링이 객체를 대신 생성하여 주입하는 기법
	private HR_memRepository memRepository;

	@Test
	void contextLoads() {
		HR_mem mem1 = new HR_mem();
	    mem1.setEmployeeID("1701001");
	    mem1.setName("김가을");
	    mem1.setStartDate("2017-03-02");
	    mem1.setDeptName("인사팀");
	    mem1.setPosition("팀장");
	    mem1.setEmail("email001@naver.com");
	    mem1.setBankNum(123456789);
	    mem1.setRegularPay(60000000);
	    this.memRepository.save(mem1);
	}

}
