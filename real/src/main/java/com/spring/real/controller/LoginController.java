package com.spring.real.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.real.constant.ViewConstant;
import com.spring.real.model.UserCredential;

@Controller
public class LoginController {

	private static final Log LOG = LogFactory.getLog(LoginController.class);



	@GetMapping("/login")
	public String showLoginForm(Model model, @RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout) {
		LOG.info("METHOD: showLoginForm()-- PARAMS: error =" + error + "logout" + logout);
		model.addAttribute("userCredentials", new UserCredential());
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		return ViewConstant.LOGIN;
	}

	@GetMapping({"/loginsuccess","/"})
	public String loginCheck() {
		LOG.info("METHOD: loginCheck()");
		LOG.info("retunring to contact view ");
		return "redirect:/contacts/showContacts";

	}
}
