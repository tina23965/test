package idv.practice.test.service.impl;

import org.springframework.stereotype.Service;

import idv.practice.test.modelbean.CustomerReqModelBean;
import idv.practice.test.modelbean.CustomerRespModelBean;
import idv.practice.test.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Override
	public CustomerRespModelBean testService(CustomerReqModelBean reqModelBean) {
		CustomerRespModelBean respModelBean=new CustomerRespModelBean();
		respModelBean.setCustomerId(reqModelBean.getCustomerId());
		respModelBean.setName(reqModelBean.getName());
		respModelBean.setAddress("臺北市中山區天祥路86巷1號");
		respModelBean.setPhone("0977888999");
		return respModelBean;
	}
}
