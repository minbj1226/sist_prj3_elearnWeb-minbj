package kr.co.sist.admin.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/review")
public class AdminReviewController {

	@GetMapping("/adminReviewList")
	public String getAdminReviewList(Model model) {
		
		return "/admin/review/adminReviewList";
	}
}
