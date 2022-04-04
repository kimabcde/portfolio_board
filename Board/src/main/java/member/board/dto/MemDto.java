package member.board.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemDto { //dto : Data Transfer Object. 데이터 전송 객체. 데이터의 전송을 담당하는 클래스이다.
						//
	@NotNull(message="writer is null.")
	@NotEmpty(message="writer is empty.")
	private String id;
	@NotNull(message="writer is null.")
	@NotEmpty(message="writer is empty.")
	private String  password;
	private String name;
	@DateTimeFormat(pattern = "yyyyMMdd")
	private Date birth; 
	private String address;
	
}
