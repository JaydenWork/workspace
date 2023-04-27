package edu.kh.project.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;


// 예외 처리용 컨트롤러(프로젝트 전역)
@Controller
public class ExceptionController {
	
		@ExceptionHandler(Exception.class)
		public String exceptionHandeler(Exception e, Model model) {
			
			// Exceptione : 예외 정보를 담고있는 객체
			// Model model : 데이터 전달용 객체(request scope가 기본)
			
			e.printStackTrace(); // 예외 내용/발생 메서드 확
			
			model.addAttribute("e", e);
			
			
			// forward 진행 -> Veiw Resolver의 prefix, suffix를 붙여 JSP 경로로 만
			return "common/error";
		}
}
