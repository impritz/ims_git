package com.ci.ims.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm{

	 /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String uName;
	 private String pWd;

	 public String getuName() {
	  return uName;
	 }
	 public void setuName(String uName) {
	  this.uName = uName;
	 }
	 public String getpWd() {
	  return pWd;
	 }
	 public void setpWd(String pWd) {
	  this.pWd = pWd;
	 }
	}
