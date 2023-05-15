package edu.kh.project.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.kh.project.board.model.dto.Comment;
import edu.kh.project.board.model.service.CommentService;

//@Controller + @ResponseBody
@RestController // 요청/응답 처리(단, 모든 요청 응답은 비동기)
				// --> REST API 구축하기 위한 controller
public class CommentController {

	@Autowired
	private CommentService service;
	
	@GetMapping(value="/comment", produces="application/json; charset=UTF-8")
	public List<Comment> select(@RequestParam("boardNo") int boardNo // 같으면 어노테이션 생략 가능
			) {
		return service.select(boardNo);
	}
	
	
	@PostMapping("/comment")
	public int insert(@RequestBody Comment comment) {
		//요청 데이터(제이슨)을 httpmessageconverter가 해석해
		
	return service.insert(comment);
		
	}
	
	// 댓글 삭제
	@DeleteMapping("/comment")
	public int delete(@RequestBody int commentNo) {
		// ajax 요청 시 body에 담겨있는 하나 밖에 없는 데이터는
		// 매개변수 int commentNO 담기게 된다
		return service.delete(commentNo);
		
	}
	
	@PutMapping("/comment")
	public int update(@RequestBody Comment comment) {
		return service.update(comment);
	}
}
