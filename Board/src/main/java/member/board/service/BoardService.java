package member.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.board.dao.BoardDao;
import member.board.dto.BoardDto;

@Service
public class BoardService {
	
	@Autowired
	BoardDao dao;
	
	public int count() {
		return dao.count();
	}
	
	public List<BoardDto> boardList(int start, int end){
		
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("start", start);
		m.put("end", end);
		
		return dao.boardList(m);
	}
	
	public int insert(BoardDto dto) {
		return dao.insert(dto);
	}
	public BoardDto boardOne(int no) {
		return dao.boardOne(no);
	}
	public int updateBoard(BoardDto dto) {
		return dao.updateBoard(dto);
	}
	public int deleteBoard(int no) {
		return dao.deleteBoard(no);
	}
	
	public List<BoardDto> boardListSearch(int searchn, String search,int start, int end){
		Map<String,Object> m = new HashMap<String, Object>();
		m.put("searchn",searchn);
		m.put("search", search);
		m.put("start", start);
		m.put("end", end);
		
		return dao.boardListSearch(m);
	}
	
	public int countSearch(int searchn, String search) {
		System.out.println(searchn+search);
		Map<String,Object> m = new HashMap<String, Object>();
		m.put("searchn",searchn);
		m.put("search", search);
		return dao.countSearch(m);
	}
}