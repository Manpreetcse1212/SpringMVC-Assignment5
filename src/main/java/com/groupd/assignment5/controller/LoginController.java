package com.groupd.assignment5.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.groupd.assignment5.beans.Booking;
import com.groupd.assignment5.beans.Login;
import com.groupd.assignment5.dao.LoginDaoD;

/**
 * Date: 05.04.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal This controller is used to hand post and get
 * methods for registering and showing users
 */
// This is the login controller used for registering visitores and for logging in the admin, staff and visitores
@Controller
@SessionAttributes({ "id", "type" })
public class LoginController {

	@Autowired
	LoginDaoD logindao;// will inject dao from xml file

	@RequestMapping("/")
	public String loginPage() {
		return "index";
	}

	// login for admin/staff/visitor
	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public String login(@Valid @ModelAttribute("login") Login login, BindingResult br, Model model) {
		if (br.hasErrors()) {
			return "viewlogin";
		} else {
			Login object = logindao.user_exists(login);
			if (object != null) {
				model.addAttribute("id", object.getCustomer_id());
				model.addAttribute("type", object.getUsertype());
				if (object.getUsertype().equalsIgnoreCase("admin")) {
					return "homeadmin";
				} else if (object.getUsertype().equalsIgnoreCase("staff")) {
					return "homestaff";
				} else {
					return "homeuser";
				}
			} else {
				return "redirect:/";
			}

		}
	}

	//login
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("login") Login login, BindingResult br) {
		if (br.hasErrors()) {
			return "viewlogin";
		} else {
			logindao.AddUser(login);
			return "redirect:/";
		}
	}

	@RequestMapping(value = "/visitorReg", method = RequestMethod.GET)
	public String gotovisitorReg(@ModelAttribute("login") Login login) {
		return "viewlogin";
	}

	//adding staff by admin
	@RequestMapping(value = "/addStaff", method = RequestMethod.GET)
	public String addStaff(@ModelAttribute("login") Login login) {
		return "addstaff";
	}

	@RequestMapping(value = "/saveStaff", method = RequestMethod.POST)
	public String addNewStaff(@Valid @ModelAttribute("login") Login login, BindingResult br) {
		if (br.hasErrors()) {
			return "addStaff";
		} else {
			logindao.AddUser(login);
			return "homeadmin";
		}
	}

	//editing staff by admin
	@RequestMapping(value = "/editstaff", method = RequestMethod.GET)
	public String editstaff(@ModelAttribute("login") Login login, Model model) {
		model.addAttribute("staffs", logindao.GetStaffs());
		return "viewstaffs";
	}

	@RequestMapping(value = "/editStaffShow/{username}", method = RequestMethod.GET)
	public String editStaffShow(@ModelAttribute("login") Login login, Model model, @PathVariable String username) {

		login = logindao.getOneStaff(username);
		model.addAttribute("login", login);

		return "editstaff";
	}

	@RequestMapping(value = "/updateStaff", method = RequestMethod.POST)
	public String updateStaff(@Valid @ModelAttribute("login") Login login, BindingResult br) {
		if (br.hasErrors()) {
			return "editstaff";
		} else {
			logindao.UpdateStaff(login);
			return "homeadmin";
		}
	}

}