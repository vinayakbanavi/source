package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileNumberService {
	@Autowired
	private MobileNumberRepository MobileNumberRepository;
	
	public MobileNumber save(MobileNumber mobileNumber)
	{
		return MobileNumberRepository.save(mobileNumber);
	}
	
	public Iterable<MobileNumber>load()
	{
		return MobileNumberRepository.findAll();
	}

}