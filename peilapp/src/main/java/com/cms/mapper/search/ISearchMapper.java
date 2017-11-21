package com.cms.mapper.search;

import java.util.List;

import com.cms.bean.Params;
import com.cms.bean.User;

public interface ISearchMapper {
	
	public List<User> findUsers(Params params);
	public int countUsers(Params params);
}
