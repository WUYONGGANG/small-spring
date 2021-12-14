package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: small-spring
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2021-12-14 18:26
 **/
public class BeanFactory {

	private Map<String, Object> beanMap = new HashMap<String, Object>();

	public void registerBean(String beanName, Object bean) {
		beanMap.put(beanName,bean);
	}

	public Object getBean(String beanName) {
		return beanMap.get(beanName);
	}
}
