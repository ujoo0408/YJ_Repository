package dashboard.sample.controller.service;

import java.util.List; 
import java.util.Map; 
import javax.annotation.Resource; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import dashboard.sample.controller.dao.SampleDAO;


@Service("sampleService")
public class SampleServiceImpl implements SampleService{
	protected Logger log = LoggerFactory.getLogger(this.getClass()); 
	
	@Resource(name="sampleDAO") 
	private SampleDAO sampleDAO; 
	
	@Override 
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception { 
		return sampleDAO.selectBoardList(map); 
	}

}
