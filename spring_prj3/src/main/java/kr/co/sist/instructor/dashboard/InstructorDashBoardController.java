package kr.co.sist.instructor.dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/instructor")
public class InstructorDashBoardController {

	@Autowired
	private InstructorDashBoardService idbs;
	
	@GetMapping("/dashboard")
	public String dashboard(Model model, HttpSession session) {
		int lectCnt=idbs.getTotalCountLect();
		int ScoreReview=idbs.getTotalScoreReview();
		
		model.addAttribute("lectCnt", lectCnt);
		model.addAttribute("ScoreReview", ScoreReview);
		
		model.addAttribute("pageTitle", "대시보드");
		
		return "instructor/dashboard/dashboard";
	}
}
