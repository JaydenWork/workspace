package edu.kh.project.board.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.board.model.dto.Board;
import edu.kh.project.board.model.dto.BoardImage;

@Mapper
public interface BoardMapper2 {
	

	public int boardInsert(Board board);

	
	/**이미지 리스트(여러 개 )삽입
	 * @param uploadList
	 * @return result
	 * 
	 * */
	public int insertImageList(List<BoardImage> uploadList); //메소드 지우고 추상메서드로 만들

	/**게시글 수정
	 * @param board
	 * @return rowCount
	 * */
	public int boardUpdate(Board board);


	
	/**이미지 삭제
	 * 
	 * */
	public int imageDelete(Map<String, Object> deleteMap);

	/**이미지 수정
	 * 
	 * */
	public int imageUpdate(BoardImage img);


	/**이미지 삽입
	 * 
	 * */
	public int imageInsert(BoardImage img);

	
	/**게시글 삭제
	 * 
	 * 
	 * */
	public int boardDelete(Map map);
}
