package dashboard.sample.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dashboard.common.common.CommandMap;
import dashboard.sample.service.SampleService;

import dashboard.common.logger.LoggerInterceptor;
import dashboard.sample.service.SampleService;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class SampleController {

	//Logger log = Logger.getLogger(this.getClass()); 
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	@Resource(name="sampleService")
	private SampleService sampleService; 
	
	@RequestMapping(value="/sample/openBoardList.do") 
	public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{ 
		ModelAndView mv = new ModelAndView("/sample/boardList"); 
		
		List<Map<String,Object>> list = sampleService.selectBoardList(commandMap); 
		mv.addObject("list", list); 
		
		return mv; 
	}
	
	@RequestMapping(value="/sample/testMapArgumentResolver.do")
	public ModelAndView testMapArgumentResolver(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("");
		
		if(commandMap.isEmpty() == false){
			Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
			Entry<String,Object> entry = null;
			while(iterator.hasNext()){
				entry = iterator.next();
				log.debug("key : "+entry.getKey()+",\tvalue : "+entry.getValue());
			}
		}
		return mv;
	}
	
	@RequestMapping(value="/sample/openBoardWrite.do") 
	public ModelAndView openBoardWrite(CommandMap commandMap) throws Exception{ 
		ModelAndView mv = new ModelAndView("/sample/boardWrite"); 
		
		return mv; 
	}
	
	//작성 페이지
	@RequestMapping(value="/sample/insertBoard.do") 
	public ModelAndView insertBoard(CommandMap commandMap, HttpServletRequest request) throws Exception{ 
		ModelAndView mv = new ModelAndView("redirect:/sample/openBoardList.do"); 
		
		sampleService.insertBoard(commandMap.getMap(), request); 
		
		return mv; 
	}

	//상세화면 페이지
	@RequestMapping(value="/sample/openBoardDetail.do") 
	public ModelAndView openBoardDetail(CommandMap commandMap) throws Exception{ 
		ModelAndView mv = new ModelAndView("/sample/boardDetail"); 
		
		Map<String,Object> map = sampleService.selectBoardDetail(commandMap.getMap()); 
		
		mv.addObject("map",  map.get("map")); 
		mv.addObject("list", map.get("list"));
		
		return mv; 
	}
	
	//수정 페이지
	@RequestMapping(value="/sample/openBoardUpdate.do") 
	public ModelAndView openBoardUpdate(CommandMap commandMap) throws Exception{ 
		ModelAndView mv = new ModelAndView("/sample/boardUpdate"); 
		
		Map<String,Object> map = sampleService.selectBoardDetail(commandMap.getMap()); 

		mv.addObject("map", map.get("map")); 
		mv.addObject("list", map.get("list"));
		
		return mv; 
	} 
	
	@RequestMapping(value="/sample/updateBoard.do") 
	public ModelAndView updateBoard(CommandMap commandMap, HttpServletRequest request) throws Exception{ 
		ModelAndView mv = new ModelAndView("redirect:/sample/openBoardDetail.do"); 
		
		sampleService.updateBoard(commandMap.getMap(), request);
		
		mv.addObject("IDX", commandMap.get("IDX")); 
		
		return mv; 
	}
	
	//삭제
	@RequestMapping(value="/sample/deleteBoard.do") 
	public ModelAndView deleteBoard(CommandMap commandMap) throws Exception{ 
		ModelAndView mv = new ModelAndView("redirect:/sample/openBoardList.do"); 
		sampleService.deleteBoard(commandMap.getMap()); 
		
		return mv; 
	}

	
}
