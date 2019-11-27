package com.sathya.iservice;

import com.sathya.model.Browser;

public interface IBrowserService {
	
public void save(Browser b);


public Browser getBYId(Integer id);

public void delete(Integer id);


}
