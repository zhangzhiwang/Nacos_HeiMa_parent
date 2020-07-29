package com.asiainfo;

import java.util.Properties;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

public class App {
	public static void main(String[] args) throws NacosException {
		// 到nacos获取配置
		Properties properties = new Properties();
		properties.put("serverAddr", "localhost:8848");// 指定nacos配置中心的ip和端口
		
		String dataId = "test.yml";
		String group = "DEFAULT_GROUP";
		ConfigService configService = NacosFactory.createConfigService(properties);
		String config = configService.getConfig(dataId, group, 5000);// 指定配置的dataId和group
		System.out.println(config);
	}
}
