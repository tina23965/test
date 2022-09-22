package idv.practice.test.modelbean;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class CustomerReqModelBean {
	
	private String customerId;
	private String name;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public CustomerReqModelBean(String customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}
	
	public CustomerReqModelBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerReqModelBean other = (CustomerReqModelBean) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "CustomerReqModelBean [customerId=" + customerId + ", name=" + name + "]";
	}
	
	

}
