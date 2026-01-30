package kr.co.sist.admin.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController {

	@GetMapping("/searchUser")
	public String admSearchStu(Model model) {
		
		return "/admin/member/searchUser";
	}
	
	@GetMapping("/searchInst")
	public String admSearchInst(Model model) {
		
		return "/admin/member/searchInst";
	}
}
