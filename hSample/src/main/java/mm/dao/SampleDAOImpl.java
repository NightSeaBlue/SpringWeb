package mm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDAOImpl implements SampleDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public String sample() {
		
		String serverTime = sqlSession.selectOne("sample");
		
		return serverTime;
	}

}
