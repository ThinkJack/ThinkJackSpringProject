package org.thinkjack.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.thinkjack.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;
	

}
