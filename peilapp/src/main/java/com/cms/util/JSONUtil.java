/*package com.cms.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

*//**
 * 
 * jsonת���� JSONUtil<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2017��7��21��-����9:12:14 <br/>
 * 
 * @version 1.0.0<br/>
 *
 *//*
public class JSONUtil {

	
	 * �����json-lib-2.4-jdk15.jar
	 

	*//**
	 * ���� mapת�ַ� ������toJson<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2017��7��21��-����9:52:14 <br/>
	 * �ֻ�:1564545646464<br/>
	 * 
	 * @param object
	 * @return String<br/>
	 * @exception <br/>
	 * @since 1.0.0<br/>
	 *//*
	public static String toJson(Object object) {
		// JsonConfig�ṩ���ڶ�һ��Json����Java������л�תʱ����ѡ���ԵĹ��˵�һЩ����ֵ�ķ���
		JsonConfig config = new JsonConfig();
		config.registerJsonValueProcessor(Date.class, new JSONUtil.DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
		JSONObject jsonObject = new JSONObject();
		String json = jsonObject.fromObject(object, config).toString();
		return json;
	}

	*//**
	 * ����תjson�ַ� ������toJson<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2017��7��21��-����9:51:53 <br/>
	 * �ֻ�:1564545646464<br/>
	 * 
	 * @param object
	 * @return String<br/>
	 * @exception <br/>
	 * @since 1.0.0<br/>
	 *//*
	public static String toJson(List object) {
		JsonConfig config = new JsonConfig();
		config.registerJsonValueProcessor(Date.class, new JSONUtil.DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
		JSONArray jsonArray = new JSONArray();
		String jsonstring = jsonArray.fromObject(object, config).toString();
		return jsonstring;
	}

	static class DateJsonValueProcessor implements JsonValueProcessor {
		private String format;

		public DateJsonValueProcessor(String format) {
			this.format = format;
		}

		public Object processArrayValue(Object value, JsonConfig jsonConfig) {
			return null;
		}

		public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
			if (value == null) {
				return "";
			}
			if (value instanceof java.sql.Timestamp) {
				String str = new SimpleDateFormat(format).format((java.sql.Timestamp) value);
				return str;
			}
			if (value instanceof java.util.Date) {
				String str = new SimpleDateFormat(format).format((java.util.Date) value);
				return str;
			}

			return value.toString();
		}
	}
}*/