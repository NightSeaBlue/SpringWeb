package mm.service;

import java.util.HashMap;
import java.util.List;

import mm.domain.EmpVO;

public interface EmpService {
	List<EmpVO> empSelect();
	
	List<HashMap> empDept();

}
