package com.project.service;

import java.util.List;

import com.project.data.AccountDTO;
import com.project.data.MannequinDTO;

public interface MannequinService {
	
	public AccountDTO loginAccount(AccountDTO accountDTO);
	public void insertAccount(AccountDTO accountDTO);
	public AccountDTO getAccount(int sessionId);
	public MannequinDTO getMannequin(int mannequinId);
	public List<MannequinDTO> getMannequinList(int sessionId);
	
}
