package com.project.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.data.AccountDTO;
import com.project.data.MannequinDTO;

@Repository
public class MannequinDAOImpl implements MannequinDAO{

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="com.project.mappers.mannequinMapper";
	
	@Override
	public AccountDTO loginAccount(AccountDTO accountDTO) {
		return sqlSession.selectOne(namespace+".loginAccount", accountDTO);
	}

	@Override
	public void insertAccount(AccountDTO accountDTO) {
		sqlSession.insert(namespace+".insertAccount", accountDTO);
	}

	@Override
	public AccountDTO getAccount(int sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MannequinDTO getMannequin(int mannequinId) {
		return sqlSession.selectOne(namespace+".getMannequin", mannequinId);
	}

	@Override
	public List<MannequinDTO> getMannequinList(int sessionId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
