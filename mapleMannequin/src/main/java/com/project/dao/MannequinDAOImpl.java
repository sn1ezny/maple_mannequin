package com.project.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.data.UserDTO;

@Repository
public class MannequinDAOImpl implements MannequinDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.project.mappers.mannequinMapper";
	
	@Override
	public UserDTO loginUser(UserDTO userDTO) {
		return sqlSession.selectOne(namespace+".loginUser", userDTO);
	}
	
}
