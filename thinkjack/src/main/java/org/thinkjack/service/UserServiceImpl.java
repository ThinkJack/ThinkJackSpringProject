package org.thinkjack.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.thinkjack.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO dao;
}
