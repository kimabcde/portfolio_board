package member.board.intercepter;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import member.board.dto.MemDto;

@Component
public class LoginIntercepter implements HandlerInterceptor {
	
	public List<String> loginEssential = Arrays.asList("/board/**");

	public List<String> loginInessential
     = Arrays.asList("/board/list/**","/board/content/**");

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		MemDto dto = (MemDto) request.getSession().getAttribute("user");
	
		if (dto != null && dto.getId() != null) {
			return true;
		} else {
			response.sendRedirect("/main");
			return false;	}
	}
}