package com.cms.mapper.bgcontent;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cms.bean.Category;
import com.cms.bean.Content;
import com.cms.bean.Params;


public interface IbgContentMapper {
	
	/**
	 * 查询内容(后端)
	 * (这里用一句话描述这个方法的作用)<br/>
	 * 方法名：findCategory<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月6日-下午2:45:40 <br/>
	 * 手机:1564545646464<br/>
	 * @return List<Category><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<HashMap<String, Object>> selectContent(Params params);
	
	/**
	 * 根据ID查询
	 * (这里用一句话描述这个方法的作用)<br/>
	 * 方法名：delCategory<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月6日-下午2:52:54 <br/>
	 * 手机:1564545646464<br/>
	 * @param id
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<HashMap<String, Object>> selectIdbgContent(@Param("id")Integer id);
	
}
