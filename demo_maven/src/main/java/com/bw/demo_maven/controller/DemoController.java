/**
 * 
 */
package com.bw.demo_maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YQ
 * @CreateTime 2021年1月5日 下午3:15:28
 */
@Controller
public class DemoController {

	@RequestMapping("/list")
	public String list(){
		return "list";
	}
	
}
