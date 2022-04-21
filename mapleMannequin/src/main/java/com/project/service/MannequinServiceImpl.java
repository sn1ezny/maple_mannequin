package com.project.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.dao.MannequinDAO;
import com.project.data.UserDTO;

@Service
public class MannequinServiceImpl implements MannequinService {

	@Inject
	private MannequinDAO mannequinDAO;
	
	@Override
	public UserDTO loginUser(UserDTO userDTO) {
		return mannequinDAO.loginUser(userDTO);
	}

}
