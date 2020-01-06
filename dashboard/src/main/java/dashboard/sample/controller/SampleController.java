package dashboard.sample.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dashboard.common.logger.LoggerInterceptor;
import dashboard.sample.service.SampleService;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class SampleController {

	//Logger log = Logger.getLogger(this.getClass()); 
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	@Resource(name="sampleService")
	private SampleService sampleService; 
	
	@RequestMapping(value="/sample/openSampleBoardList.do") 
	public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{ 
		ModelAndView mv = new ModelAndView("/sample/boardList"); 
		
		List<Map<String,Object>> list = sampleService.selectBoardList(commandMap); 
		mv.addObject("list", list); 
		
		return mv; 
	}

}
