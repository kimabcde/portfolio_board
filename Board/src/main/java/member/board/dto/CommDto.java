package member.board.dto;

import java.util.Date;
import lombok.Data;

@Data
public class CommDto {
	private int cno;
	private String id;
	private String content;
	private Date regdate;	//import java.util.Date;
	private int no;
}