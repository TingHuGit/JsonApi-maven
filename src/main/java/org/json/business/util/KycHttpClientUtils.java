package org.json.business.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class KycHttpClientUtils {

	public static String sendHttpRequest(String url, String jsonKey,String jsonValue) {
		// 1. 创建HttpClient对象
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		// 2. 创建HttpPost对象
		HttpPost post = new HttpPost(url);
		// 3. 设置POST请求传递参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair(jsonKey, jsonValue));
		try {
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params,"utf-8");
			post.setEntity(entity);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// 4. 执行请求并处理响应
		try {
			CloseableHttpResponse response = httpClient.execute(post);
			HttpEntity entity = response.getEntity();
			String message = EntityUtils.toString(entity);
			/*if (entity != null) {
				System.out.println("响应内容：");
				System.out.println(EntityUtils.toString(entity));
			}*/			
			response.close();
			return message;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		return null;
	}
}