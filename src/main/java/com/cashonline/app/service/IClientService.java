package com.cashonline.app.service;




import org.springframework.stereotype.Service;

import com.cashonline.app.models.entity.Client;

@Service
public interface IClientService {
	
	public Client findById(Long Id);
	
	
}