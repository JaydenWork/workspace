package edu.kh.jdbc.board.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.close;
import static edu.kh.jdbc.common.JDBCTemplate.commit;
import static edu.kh.jdbc.common.JDBCTemplate.getConnection;
import static edu.kh.jdbc.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.board.model.dao.CommentDAO;
import edu.kh.jdbc.board.model.dto.Board;
import edu.kh.jdbc.board.model.dto.Comment;

public class CommentService {

	private CommentDAO commentDao = new CommentDAO();

	// 내용, 게시글 번호, 로그 회원 번호

	public int insertComment(String commentContent, int memberNo) throws Exception {

		Connection conn = getConnection();

		int commentNo = commentDao.nextCommentNo(conn);

		// 제목, 내용, 회원번호 + 다음 게시글번호(4)
		int result = commentDao.insertComment(conn, commentNo, commentContent, memberNo);

		if (result > 0) {
			commit(conn);
			result = commentNo;
		} else {
			rollback(conn);
		}

		close(conn);

		return result; // 삽입 성공 시 다음 게시글 번호
		// 실패 시 0
	}

}
