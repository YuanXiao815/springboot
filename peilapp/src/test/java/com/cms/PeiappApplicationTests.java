package com.cms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cms.bean.Params;
import com.cms.bean.Reg;
import com.cms.bean.User;
import com.cms.mapper.accredit.IAccreditMapper;
import com.cms.mapper.bgcontent.IbgContentMapper;
import com.cms.mapper.comment.ICommentMapper;
import com.cms.mapper.reg.IRegMapper;
import com.cms.mapper.search.ISearchMapper;
import com.cms.util.MD5PwdUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeiappApplicationTests {
	
	
	@Autowired
	private IAccreditMapper accreditMapper;

	@Autowired
	private ICommentMapper commentMapper;
	
	@Autowired
	private IbgContentMapper bgContentMapper;
	

	@Autowired
	private ISearchMapper searchMapper;

	
	@Autowired
	private IRegMapper regMapper;

	@Test
	public void contextLoads() {
	  Reg reg=new Reg();
	  reg.setUsername("雯屁股");
	  int a =regMapper.insertReg(reg);
	   System.out.println(a);
	}

	@Test
	public void insertUser() {
		 Params params=new Params();
		 params.setPageNo(0);
		   params.setPageSize(5);
		   params.setKeyword("肖");
		List<User> users = searchMapper.findUsers(params);
		System.out.println(users);
	}

	@Test
	public void selectComment() {
	
	}
}
