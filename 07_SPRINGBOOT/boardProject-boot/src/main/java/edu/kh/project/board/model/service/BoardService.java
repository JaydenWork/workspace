package edu.kh.project.board.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.project.board.model.dto.Board;

public interface BoardService{
	
	// 게시판 종류 조회
	List<Map<String, Object>> selectBoardTypeList();
	
	/** 게시글 목록 조회
	 * @param boardCode
	 * @param cp
	 * @return
	 */
	Map<String, Object> selectBoardList(int boardCode, int cp);

	/** 게시글 상세 조회
	 * @param map
	 * @return Board
	 */
	Board selectBoard(Map<String, Object> map);

	/** 좋아요 여부 확인 서비스
	 * @param map
	 * @return
	 */
	int boardLikeCheck(Map<String, Object> map);

	/** 좋아요 처리 서비스
	 * @param paramMap
	 * @return
	 */
	int like(Map<String, Integer> paramMap);

	/** 조회수 증가
	 * @param boardNo
	 * @return
	 */
	int updateReadCount(int boardNo);

	/** 게시글 목록 조회 (검색)
	 * @param paramMap
	 * @param cp
	 * @return
	 */
	Map<String, Object> selectBoardList(Map<String, Object> paramMap, int cp);

	/** 헤더 검색
	 * @param query
	 * @return list
	 */
	List<Map<String, Object>> headerSearch(String query);

	/** DB 이미지(파일 목록 조회)
	 * @return
	 */
	List<String> selectImageListAll();
}
