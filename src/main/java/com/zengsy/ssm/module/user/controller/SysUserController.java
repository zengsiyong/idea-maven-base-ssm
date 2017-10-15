package com.zengsy.ssm.module.user.controller;

import com.zengsy.ssm.module.user.pojo.Category;
import com.zengsy.ssm.module.user.pojo.SysUser;
import com.zengsy.ssm.module.user.service.SysUserService;
import com.zengsy.ssm.module.user.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/sysUserController")
public class SysUserController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SysUserController.class);

	// 这里为什么只能用resource 或 autowired ，如果括号内再加具体的名字就会报错
	@Autowired
	private SysUserService sysUserService;

	// zengsy测试
	@Autowired
	private TestService testService;


	@RequestMapping("/showUserToJspById/{userId}")
	public String showUser(Model model,@PathVariable("userId") Long userId){
		SysUser user = this.sysUserService.getById(userId);


		// zengsy测试

		testService.addCategory(new Category());
		int categoryTotal = testService.getCategoryTotal();
		Category category = this.testService.getCategoryById(userId.intValue());
		model.addAttribute("user", user);
		model.addAttribute("category", category);
		model.addAttribute("categoryList", testService.listCategoryByLimit(0, 10));



		model.addAttribute("categoryTotal", categoryTotal);
		return "showUser";
	}
	
	@RequestMapping("/showUserToJSONById/{userId}")
	@ResponseBody
	public SysUser showUser(@PathVariable("userId") Long userId){
		SysUser user = sysUserService.getById(userId);
		return user;
	}
	
	
	@RequestMapping("/test-logback")
	@ResponseBody
	public Date testLogback(){
		LOG.trace("-----------------------------------trace");
		LOG.debug("-----------------------------------debug");
		LOG.info("-----------------------------------info");
		LOG.warn("-----------------------------------warn");
		LOG.error("-----------------------------------error");
		return new Date();
	}
	



}
