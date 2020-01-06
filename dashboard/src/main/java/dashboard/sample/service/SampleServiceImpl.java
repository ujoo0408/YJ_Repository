package dashboard.sample.service;

import java.util.List; 
import java.util.Map; 
import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Service;

import dashboard.common.logger.LoggerInterceptor;
import dashboard.sample.dao.SampleDAO; 

@Service("sampleService") 
public class SampleServiceImpl implements SampleService{ 
	//Logger log = Logger.getLogger(this.getClass()); 
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	@Resource(name="sampleDAO") 
	private SampleDAO sampleDAO; 
	
	@Override 
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception { 
		return sampleDAO.selectBoardList(map); 
	} 
}

