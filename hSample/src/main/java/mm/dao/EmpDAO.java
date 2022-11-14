package mm.dao;

import java.util.HashMap;
import java.util.List;

import mm.domain.EmpVO;

public interface EmpDAO {

	List<EmpVO> empSelect();
	
	List<HashMap> empDept();
	
}
