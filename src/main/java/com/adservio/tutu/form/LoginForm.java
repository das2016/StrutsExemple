package com.adservio.tutu.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * 
 * @author Skander.Bachouche
 *
 */
public class LoginForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	/*
	 * Constructor
	 */
	/**
	 * 
	 */
	public LoginForm() {
	}

	/**
	 * Validate Login Form
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		return actionErrors;
	}

	/**
	 * Reset Login info
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		username = null;
		password = null;
	}

	/*
	 * Getter and setter
	 */
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
