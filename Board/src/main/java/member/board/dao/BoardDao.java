package member.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import member.board.dto.BoardDto;

@Mapper
public interface BoardDao {
	int insert(BoardDto dto);
	List<BoardDto> boardList(Map<String, Object> m);
	int count();//전체 글 갯수
	BoardDto boardOne(int no);
	int updateBoard(BoardDto dto);
	int deleteBoard(int no);
	
	//검색 관련
	List<BoardDto> boardListSearch(Map<String, Object> m);
	int countSearch(Map<String, Object> m);//검색 글 갯수
	//검색 관련 끝
	
	
}