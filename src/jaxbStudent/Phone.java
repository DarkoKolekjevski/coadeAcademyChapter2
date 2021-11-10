package jaxbStudent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Phone {

	// Phone(mobile,work,home)
	
	@XmlElement
	private String mobile;
	@XmlElement
	private String work;
	@XmlElement
	private String home;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public Phone(String mobile, String work, String home) {
		super();
		this.mobile = mobile;
		this.work = work;
		this.home = home;
	}

	public Phone() {
		super();
	}

	@Override
	public String toString() {
		return "Phone [mobile=" + mobile + ", work=" + work + ", home=" + home + "]";
	}

}
