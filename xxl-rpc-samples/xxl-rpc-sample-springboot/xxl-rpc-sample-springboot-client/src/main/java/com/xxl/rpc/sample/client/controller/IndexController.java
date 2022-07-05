package com.xxl.rpc.sample.client.controller;

import com.xxl.rpc.sample.api.DemoService;
import com.xxl.rpc.sample.api.MyService;
import com.xxl.rpc.sample.api.dto.UserDTO;
import com.xxl.rpc.core.remoting.invoker.annotation.XxlRpcReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class IndexController {
	
	@XxlRpcReference
	private DemoService demoService;
	@XxlRpcReference
	private MyService myService;


	@RequestMapping("/demo")
	@ResponseBody
	public UserDTO demo(String name) {

		try {
			return demoService.sayHi(name);
		} catch (Exception e) {
			e.printStackTrace();
			return new UserDTO(null, e.getMessage());
		}
	}
	@RequestMapping("/my")
	@ResponseBody
	public UserDTO my(String name) {

		try {
			return myService.sayHi(name);
		} catch (Exception e) {
			e.printStackTrace();
			return new UserDTO(null, e.getMessage());
		}
	}

}
