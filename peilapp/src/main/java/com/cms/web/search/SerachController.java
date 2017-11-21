package com.cms.web.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cms.bean.Params;
import com.cms.bean.User;
import com.cms.mapper.search.ISearchMapper;

@Controller
@RequestMapping("admin/search")
public class SerachController {
	
	@Autowired
	private ISearchMapper searchMapper;

	@RequestMapping("/list")
	public String list(Model model, Params params) {
		int itemCount = searchMapper.countUsers(params);
		model.addAttribute("itemCount", itemCount);
		return "search/list";
	}

	@RequestMapping(value = "/template")
	public String template(Model model, Params params) {
		List<User> users = searchMapper.findUsers(params);
		int itemCount = searchMapper.countUsers(params);
		model.addAttribute("users", users);
		model.addAttribute("itemCount", itemCount);
		return "search/template";
	}
}
