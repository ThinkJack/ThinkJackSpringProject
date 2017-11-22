package org.thinkjack.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.thinkjack.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO{

	@Inject
	private SqlSession sqlSession;

	private static final String	namespace =
			"org.thinkjack.mapper.userMapper";


	@Override
	public void insertMember(UserVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);

	}
}
