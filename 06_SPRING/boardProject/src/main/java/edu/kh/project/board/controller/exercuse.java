package edu.kh.project.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kh.project.board.model.service.BoardService;

@Controller
@RequestMapping("/main")
public class exercuse {

	@Autowired
	private BoardService service;
}
