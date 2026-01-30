package kr.co.sist.admin.question;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/question")
public class AdminQuestionController {

	@GetMapping("/adminQuestionFrm")
	public String searhAllLect(Model model) {
		
		return "/admin/question/adminQuestion";
	}
}
