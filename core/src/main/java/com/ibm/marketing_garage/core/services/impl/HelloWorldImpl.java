/**
 * 
 */
package com.ibm.marketing_garage.core.services.impl;
//import org.apache.felix.scr.annotations.Property;
//import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.annotations.Component;
import com.ibm.marketing_garage.core.services.inf.HelloWorld;

/**
 * @author pankaj
 *
 */
@Component(service = HelloWorld.class)
public class HelloWorldImpl implements HelloWorld {

	/* (non-Javadoc)
	 * @see com.ibm.marketing_garage.core.services.inf.HelloWorld#sayHello()
	 */
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "This message is from Hello service";
	}

}
