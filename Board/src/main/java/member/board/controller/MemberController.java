package member.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	
	@GetMapping("/joinView")
	public String View() {
		return "member/joinView";
	}
		
}
