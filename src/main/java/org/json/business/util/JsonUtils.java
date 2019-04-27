package org.json.business.util;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

public class JsonUtils {

	public static String java2Json(Object o, String[] exclueds) {
		JsonConfig jsonConfig = new JsonConfig();
		// 指定哪些属性不需要转json
		jsonConfig.setExcludes(exclueds);
		String json = JSONObject.fromObject(o, jsonConfig).toString();
		return json;
	}
	
	public static String java2Json(List o, String[] exclueds) {
		JsonConfig jsonConfig = new JsonConfig();
		// 指定哪些属性不需要转json
		jsonConfig.setExcludes(exclueds);
		String json = JSONArray.fromObject(o, jsonConfig).toString();
		return json;
	}
}
