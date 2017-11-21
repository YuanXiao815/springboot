package com.cms.web.bgcontent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.ls.LSInput;

import com.cms.bean.Content;
import com.cms.bean.Params;
import com.cms.mapper.bgcontent.IbgContentMapper;

@Controller
@RequestMapping("/bgcontent")
public class FrontContentController {

	@Autowired
	private IbgContentMapper bgcontentMapper;

	/**
	 * 前台进入首页
	 * @return
	 */
	@RequestMapping("index")
	public String index() {
		return "front/index";
	}
	/**
	 * 前台首页数据的查询
	 * @return
	 */
	@RequestMapping("/bgtemplate")
	public ModelAndView loadpage(Params params) {
		ModelAndView modelAndView = new ModelAndView();
		List<HashMap<String, Object>> conts = bgcontentMapper.selectContent(params);
		modelAndView.addObject("conts", conts);
     	modelAndView.setViewName("front/template");
		return modelAndView;
	}
	
	@RequestMapping("/detail/{mid}")
	public ModelAndView detail(@PathVariable("mid") Integer id) {
		ModelAndView modelAndView=new ModelAndView();
	    List<HashMap<String, Object>> content=bgcontentMapper.selectIdbgContent(id);
		modelAndView.addObject("content", content);
		modelAndView.setViewName("front/detail");
		return modelAndView;
	}
}
