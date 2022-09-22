package idv.practice.test.service;

import idv.practice.test.modelbean.CustomerReqModelBean;
import idv.practice.test.modelbean.CustomerRespModelBean;

public interface CustomerService {

	CustomerRespModelBean testService(CustomerReqModelBean reqModelBean);

}
