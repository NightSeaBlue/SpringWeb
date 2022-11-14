package mm.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mm.dao.EmpDAOImpl;
import mm.domain.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDAOImpl empDao;
	
	@Override
	public List<EmpVO> empSelect() {
		
		return empDao.empSelect();
	}

	@Override
	public List<HashMap> empDept() {
		
		return empDao.empDept();
	}

}
