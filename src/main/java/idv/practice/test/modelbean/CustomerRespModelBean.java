package idv.practice.test.modelbean;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class CustomerRespModelBean {
	private String customerId;
	private String phone;
	private String name;
	private String address;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public CustomerRespModelBean(String customerId, String phone, String name, String address) {
		super();
		this.customerId = customerId;
		this.phone = phone;
		this.name = name;
		this.address = address;
	}
	
	public CustomerRespModelBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, customerId, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerRespModelBean other = (CustomerRespModelBean) obj;
		return Objects.equals(address, other.address) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	@Override
	public String toString() {
		return "CustomerRespModelBean [customerId=" + customerId + ", phone=" + phone + ", name=" + name + ", address="
				+ address + "]";
	}
	
	
}
