package member.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import member.board.dto.CommDto;
import member.board.service.CommService;

public class CommController {
	
	@Autowired
	CommService service;
	
	@PostMapping("/comm/insert")
	@ResponseBody
	public String insertComm(CommDto dto) {
		int i = service.insertComm(dto);
		return i+"";
	}
	
	@DeleteMapping("/comm/delete/{cno}")
	@ResponseBody
	public String deleteComm(@PathVariable int cno) {
		int i = service.deleteComm(cno);
		return i+"";
	}
}