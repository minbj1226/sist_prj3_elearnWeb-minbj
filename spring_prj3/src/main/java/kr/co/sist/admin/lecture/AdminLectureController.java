package kr.co.sist.admin.lecture;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/lecture")
public class AdminLectureController {

	@GetMapping("/searchAllLect")
	public String searhAllLect(Model model) {
		
		return "admin/lecture/searchAllLect";
	}
	
	@GetMapping("/searchNotApprLect")
	public String searchNotApprLect(Model model) {
		
		return "admin/lecture/searchNotApprLect";
	}
}
