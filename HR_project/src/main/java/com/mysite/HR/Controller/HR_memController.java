package com.mysite.HR.Controller;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.HR.Entity.HR_mem;
import com.mysite.HR.Service.MemService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/HR3")
@RequiredArgsConstructor	//  final이 붙은 속성을 포함하는 생성자를 자동으로 만듦 -> (= memRepository 객체 자동으로 주입됨)
@Controller
public class HR_memController {
	
	private final MemService memService;
	
	// 메인화면
	@GetMapping("/list")	
//	@ResponseBody    이 애너테이션이 있으면 mem_list라는 html을 리턴하는게 아니라 "mem_list" 문자 자체를 출력함
	public String list(Model model, @RequestParam(value="page", defaultValue="0")int page) {	// model 객체 따로 생성할 필요 없이 매개변수 지정만 하면 스프링부트에서 생성됨
		Page<HR_mem> paging = this.memService.getList(page);
		model.addAttribute("paging", paging);
		return "mem_list";
	}
	
	// 메인화면에서 이름 클릭 시 사원 상세정보 보기
	@GetMapping(value = "/detail/{EmployeeID}")	
	public String detail(Model model, @PathVariable("EmployeeID") String id) {
		HR_mem mem1 = this.memService.getHR_mem(id);
		model.addAttribute("member", mem1);
		return "mem_detail";
	}
	
	@GetMapping("/create")
	public String create() {
		return "mem_create";
	}
	
	@PostMapping("/create")
    public String create(
    		@RequestParam(value="Name") String Name,
    		@RequestParam(value="EmployeeID") String EmployeeID,
    		@RequestParam(value="StartDate") String StartDate,
    		@RequestParam(value="DeptName") String DeptName,
    		@RequestParam(value="Position") String Position,
    		@RequestParam(value="Email") String Email,
    		@RequestParam(value="BankNum") int BankNum,
    		@RequestParam(value="RegularPay") int RegularPay) {
		this.memService.create(Name, EmployeeID, StartDate, DeptName, Position, Email, BankNum, RegularPay);
        return "redirect:/HR3/list";	// 질문 저장 후 질문 목록으로 이동
    }
}
