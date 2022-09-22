package idv.practice.test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.practice.test.modelbean.CustomerReqModelBean;
import idv.practice.test.modelbean.CustomerRespModelBean;
import idv.practice.test.service.CustomerService;
import io.swagger.annotations.Api;

@Api(tags = "Todo list 相關api")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@PostMapping("/get")
	public CustomerRespModelBean test(@Valid @RequestBody CustomerReqModelBean reqModelBean) {
		
		CustomerRespModelBean respModelBean=service.testService(reqModelBean);
		return respModelBean;
	}

}
