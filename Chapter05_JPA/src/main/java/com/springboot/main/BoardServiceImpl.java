package com.springboot.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // bean생성
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void write() {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setId("neo");
		boardDTO.setName("네오!");
		boardDTO.setSubject("네오입니다.");
		boardDTO.setContent("네오안녕");
		
		boardDAO.save(boardDTO); //save메소드는 boardDAO 의 JpaRepository 가 가지고 있는 것임
	}

	@Override
	public List<BoardDTO> getBoardList() {
		
		return boardDAO.findAll();
	}

}
