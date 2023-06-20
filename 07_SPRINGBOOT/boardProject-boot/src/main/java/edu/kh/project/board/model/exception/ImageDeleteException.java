package edu.kh.project.board.model.exception;

public class ImageDeleteException extends RuntimeException{
	
	

	public ImageDeleteException() {
		super("이미지 삭제");
		// TODO Auto-generated constructor stub
	}

	public ImageDeleteException(String message) {
		super(message);
	}

}
