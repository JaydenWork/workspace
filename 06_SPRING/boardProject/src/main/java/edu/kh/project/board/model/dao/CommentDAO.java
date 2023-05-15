package edu.kh.project.board.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.board.model.dto.Comment;

@Repository // DB관련 + bean 등록IOC
public class CommentDAO {
	
	@Autowired // DI, root-context.xml에서 bean등록
	private SqlSessionTemplate sqlSession;

	public List<Comment> select(int boardNo) {
		//board-mapper.xml에 작성된 select 이용
		return sqlSession.selectList("boardMapper.selectCommentList", boardNo);
	}

	public int insert(Comment comment) {
		// TODO Auto-generated method stub
		return sqlSession.insert("commentMapper.insert", comment);
	}

	public int delete(int commentNo) {
		// TODO Auto-generated method stub
		return sqlSession.update("commentMapper.delete", commentNo);
	}

	
	public int update(Comment comment) {
		// TODO Auto-generated method stub
		return sqlSession.update("commentMapper.update", comment);
	}

	
}
