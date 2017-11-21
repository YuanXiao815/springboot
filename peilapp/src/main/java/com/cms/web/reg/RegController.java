package com.cms.web.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.Reg;
import com.cms.mapper.reg.IRegMapper;

@Controller
@RequestMapping("/reg")
public class RegController {

	@Autowired
	private IRegMapper regMapper;

	/**
	 * 跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("/list")
	public String reg() {
		return "reg/list";
	}

	/**
	 * 添加用户
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/reglist")
	public String reglist(Reg reg) {
		int a = regMapper.insertReg(reg);
		if (a > 0) {
			return "success";
		} else {
			return "fail";
		}
	}
}
