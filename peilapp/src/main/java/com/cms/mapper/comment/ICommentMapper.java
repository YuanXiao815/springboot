package com.cms.mapper.comment;

import java.util.List;
import java.util.Map;

import com.cms.bean.Comment;
import com.cms.bean.Params;

public interface ICommentMapper {

	/**
	 * 查询所有评论
	 */
	public List<Map<String, Object>> findComments(Params params);

	/**
	 * 查询总数*
	 * 
	 * @return
	 */
	public int findCount();

	/*
	 * 修改评论*
	 */
	public int updataComment(Comment comment);
}
