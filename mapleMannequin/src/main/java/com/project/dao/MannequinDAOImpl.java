package com.project.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.data.AccountDTO;

@Repository
public class MannequinDAOImpl implements MannequinDAO{

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="com.project.mappers.mannequinMapper";
	
	@Override
	public AccountDTO loginAccount(AccountDTO accountDTO) {
		return sqlSession.selectOne(namespace+".loginAccount", accountDTO);
	}
	
}
