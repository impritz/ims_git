package com.friends.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.friends.dao.LoginDao;
import com.friends.form.LoginForm;

public class LoginAction extends Action {
	 
	 
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response){
	  
	  String key = null;
	 
	  try{
	   //get the values from LoginForm by creating an object
	   LoginForm lf = (LoginForm)form;
	   String un = lf.getuName();
	   String pw = lf.getpWd();
	   LoginDao dao=new LoginDao();
	   //pass the un,pw values to the LoginDao class of insert method
	   int i=dao.insert(un,pw);
	 
	   if(i>0){
	    key="success";
	   }
	   else
	   {
	    key="failure";
	   }
	  }
	  catch(Exception e){
	   e.printStackTrace();
	 
	  }
	  return mapping.findForward(key);
	 }
	}
