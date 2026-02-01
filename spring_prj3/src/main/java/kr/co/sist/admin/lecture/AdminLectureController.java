package kr.co.sist.admin.lecture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/lecture")
public class AdminLectureController {

	@Autowired
	private AdminLectureService als;
	
	@GetMapping("/searchAllLect")
	public String searhAllLect(Model model) {
		List<ManageLectureDomain> lectureList=als.searchLectureList();
		model.addAttribute("lectList", lectureList);
		
		return "admin/lecture/searchAllLect";
	}
	
	@GetMapping("/searchNotApprLect")
	public String searchNotApprLect(Model model) {
		
		return "admin/lecture/searchNotApprLect";
	}
}
