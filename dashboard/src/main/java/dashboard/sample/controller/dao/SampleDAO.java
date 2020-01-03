package dashboard.sample.controller.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import dashboard.common.logger.dao.AbstractDAO; 

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) {
		log.debug("DAD____________________sample.selectBoardList");
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	}
}