/**
 * 
 */
package com.sudhir.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sudhir.beans.WishMessage;

/**
 * @author sudhi
 *
 */
public class test {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("src\\com\\sudhir\\conf\\application-context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Object obj = factory.getBean("wish");
		WishMessage wishMessage = (WishMessage) obj;
		wishMessage.printMessage("Nataraz");
	}

}
