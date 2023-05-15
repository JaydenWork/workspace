package edu.kh.project.board.model.service;

import java.util.List;

import edu.kh.project.board.model.dto.Comment;

public interface CommentService {

	List<Comment> select(int boardNo);

	int insert(Comment comment);

	
	/**댓글 삭제
	 * */
	int delete(int commentNo);

	
	/**댓글 수정
	 * */
	int update(Comment comment);


}
