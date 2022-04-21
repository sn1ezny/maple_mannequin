package com.project.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.dao.MannequinDAO;
import com.project.data.AccountDTO;

@Service
public class MannequinServiceImpl implements MannequinService {

	@Inject
	private MannequinDAO mannequinDAO;
	
	@Override
	public AccountDTO loginAccount(AccountDTO accountDTO) {
		return mannequinDAO.loginAccount(accountDTO);
	}

}
