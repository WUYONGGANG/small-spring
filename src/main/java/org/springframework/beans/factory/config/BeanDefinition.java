package org.springframework.beans.factory.config;

/**
 * @program: small-spring
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2021-12-14 19:07
 **/
public class BeanDefinition {

	private Object bean;

	public Object getBean() {
		return bean;
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}
}
