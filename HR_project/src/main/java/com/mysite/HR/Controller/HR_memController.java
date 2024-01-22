package com.mysite.HR.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mysite.HR.Entity.HR_mem;
import com.mysite.HR.Repository.HR_memRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor	//  final이 붙은 속성을 포함하는 생성자를 자동으로 만듦 -> (= memRepository 객체 자동으로 주입됨)
@Controller
public class HR_memController {
	
	private final HR_memRepository memRepository;
	
	@GetMapping("/HR3/list")
//	@ResponseBody    이 애너테이션이 있으면 mem_list라는 html을 리턴하는게 아니라 "mem_list" 문자 자체를 출력함
	
	public String list(Model model) {	// model 객체 따로 생성할 필요 없이 매개변수 지정만 하면 스프링부트에서 생성됨
		List<HR_mem> memList = this.memRepository.findAll();
		model.addAttribute("memList", memList);	// 모든 데이터를 model에 넣어뒀다가 템플릿에서 사용 가능. 
		return "mem_list";
	}
}
