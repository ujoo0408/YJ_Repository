package dashboard.common.service;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import dashboard.common.logger.LoggerInterceptor;
import dashboard.common.dao.CommonDAO;

@Service("commonService")
public class CommonServiceImpl implements CommonService{
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	@Resource(name="commonDAO")
	private CommonDAO commonDAO;

	@Override
	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception {
		return commonDAO.selectFileInfo(map);
	}
}