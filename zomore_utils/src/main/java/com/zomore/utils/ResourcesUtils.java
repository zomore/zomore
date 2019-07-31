package com.zomore.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.*;

/**
 * 资源解析器
 * 
 * @author 杨杰
 * @version 2018年4月26日
 * @see ResourcesUtils
 * @since
 */
public class ResourcesUtils {
	/**
	 * 解析模板文件
	 * 
	 * @param extFile 外部模板
	 * @return
	 * @throws FileNotFoundException
	 * @see
	 */
	public String getResource(String extFile,String member) throws Exception {
		String jsonStr = "";
		InputStream stream = null;
		try {
			if (StringUtils.isBlank(extFile)) {
				//使用相对于当前项目的classpath的相对路径来查找资源。
				if(member!=null&&!member.equals("")){
					stream = this.getClass().getResourceAsStream("/templateMember.json");
				}
				else {
					stream = this.getClass().getResourceAsStream("/template.json");
				}
			} else {
				File file = new File(extFile);
				stream = new FileInputStream(file);
			}
			byte[] bytes = new byte[stream.available()];
			stream.read(bytes);
			jsonStr = new String(bytes, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}





		return jsonStr;
	}
}
