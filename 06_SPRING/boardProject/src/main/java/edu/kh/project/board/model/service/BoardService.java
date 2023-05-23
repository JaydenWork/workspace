package edu.kh.project.board.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.project.board.model.dto.Board;

public interface BoardService {


	List<Map<String, Object>> selectBoardTypeList();

	
	
	/**게시글 목록 조회
	 * @param boardCode
	 * @param cp
	 * 
	 * 
	 * */
	Map<String, Object> selectBoardList(int boardCode, int cp);




	Board selectBoard(Map<String, Object> map);



	int boardLikeCheck(Map<String, Object> map);



	int like(Map<String, Integer> paramMap);



	int updateReadCount(int boardNo);



	Map<String, Object> selectBoardList(Map<String, Object> paramMap, int cp);
	
	/** 헤더 검색
	 * @param query
	 * @return list
	 */
	List<Map<String, Object>> headerSearch(String query);



	
	List<String> selectImageList();






}
