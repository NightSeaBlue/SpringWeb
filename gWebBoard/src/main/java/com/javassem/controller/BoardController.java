package com.javassem.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	// 게시판 불러오기
	@RequestMapping("getBoardList.do")
	public void getBoardList(Model m) {
		
	List<BoardVO> list = boardService.getBoardList();
	m.addAttribute("boardList", list);
	
	}
	
	// 글 입력 창 띄우기
	@RequestMapping("insertBoard.do")
	public void insertBoard() {
		
	}
	
	// 입력 후 저장
	@RequestMapping("saveBoard.do")
	public String saveBoard(BoardVO boardVO) {
		//System.out.println(boardVO.getContent());
		boardService.insertBoard(boardVO);
		//return "redirect:getBoard.do";
		return "redirect:getBoardList.do";
		
	}
	
	// 상세보기
	@RequestMapping("getBoard.do")
	public void getBoard(Model m, BoardVO boardVO) {
		m.addAttribute("board", boardService.getBoard(boardVO));
	}
	
	// 수정하기
	@RequestMapping("updateBoard.do")
	public String updateBoard(int seq, BoardVO boardVO) {
		boardService.updateBoard(boardVO);
		
		return "redirect:getBoard.do?seq="+seq;
	}
	// 삭제하기
	@RequestMapping("deleteBoard.do")
	public String deleteBoard(BoardVO boardVO) {
		boardService.deleteBoard(boardVO);
		return "redirect:getBoardList.do";
	}

}
