package com.test.ch1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class TestMain {
	public static void main(String[] args) {
		Resource r = new FileSystemResource("src/helloMessage.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Person person = (Person) factory.getBean("person");
		String message = person.sayHello();
		System.out.println("sayHello message: " + message);
	}
}
