package com.asiainfo;

import java.util.Properties;
import java.util.concurrent.Executor;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

public class App {
	public static void main(String[] args) throws NacosException, InterruptedException {
		// 到nacos获取配置
		String dataId = "test.yml";
		String group = "DEFAULT_GROUP";
		String namespace = "bcdc77ae-9102-45e2-9801-e4129972dfbf";// 指定命名空间，注意必须是命名空间的id而不是名称
		
		Properties properties = new Properties();
		properties.put("serverAddr", "localhost:8848");// 指定nacos配置中心的ip和端口
		properties.put("namespace", namespace);// 如果不指定命名空间则使用默认的命名空间-public
		ConfigService configService = NacosFactory.createConfigService(properties);
		String config = configService.getConfig(dataId, group, 5000);// 指定配置的dataId和group
		System.out.println(config);
		
		configService.addListener(dataId, group, new Listener() {// 监听配置中心

			public Executor getExecutor() {
				return null;
			}

			/**
			 * 如果配置中心的指定配置发生了变化，那么会通知此客户端回调方法
			 */
			public void receiveConfigInfo(String configInfo) {
				System.out.println("配置中心的配置发生了变化：");
				System.out.println(configInfo);
			}});
		
		while(true) {
			Thread.sleep(1000);
		}
	}
}
