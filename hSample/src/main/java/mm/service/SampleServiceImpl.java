package mm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mm.dao.SampleDAOImpl;



@Service
public class SampleServiceImpl implements SampleService{

	@Autowired
	SampleDAOImpl dao;
		
	public String sample() {
		
		return dao.sample();
	}

}
