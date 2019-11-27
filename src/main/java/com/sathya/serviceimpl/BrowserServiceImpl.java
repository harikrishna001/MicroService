package com.sathya.serviceimpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.iservice.IBrowserService;
import com.sathya.model.Browser;
import com.sathya.repo.BrowserRepo;

@Service
public class BrowserServiceImpl  implements IBrowserService{

	@Autowired
	private BrowserRepo repo;
	@Override
	@Transactional
	public void save(Browser b) {
repo.save(b);

		
	}
	
	@Override
	public Browser getBYId(Integer id) {

		Optional<Browser> a = repo.findById(id);
		
		if(a.isPresent())
		{
			return a.get();
		}else
		{
			return null;
		}
		
	}
	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
		
		

	}
}
