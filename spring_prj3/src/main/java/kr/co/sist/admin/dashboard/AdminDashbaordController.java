package kr.co.sist.admin.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminDashbaordController {

	@GetMapping("/")
	public String dashboard() {
		
		return "admin/dashboard/dashboard";
	}
}
