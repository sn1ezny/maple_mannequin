package com.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.dao.MannequinDAO;
import com.project.data.AccountDTO;
import com.project.data.MannequinDTO;

@Service
public class MannequinServiceImpl implements MannequinService {

	@Inject
	private MannequinDAO mannequinDAO;
	
	@Override
	public AccountDTO loginAccount(AccountDTO accountDTO) {
		return mannequinDAO.loginAccount(accountDTO);
	}

	@Override
	public void insertAccount(AccountDTO accountDTO) {
		mannequinDAO.insertAccount(accountDTO);
	}

	@Override
	public AccountDTO getAccount(int sessionId) {
		return mannequinDAO.getAccount(sessionId);
	}

	@Override
	public MannequinDTO getMannequin(int mannequinId) {
		return mannequinDAO.getMannequin(mannequinId);
	}

	@Override
	public List<MannequinDTO> getMannequinList(int sessionId) {
		return mannequinDAO.getMannequinList(sessionId);
	}
	
	

}
