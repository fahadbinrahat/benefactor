package com.benefactor.controller.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport{
	
	public String execute(){
		System.out.println("Invalidating session");
		Map session = (Map) ActionContext.getContext().get("session");
		session.put("userobj",null);
		
		if (session instanceof org.apache.struts2.dispatcher.SessionMap) {
			System.out.println("Yes it is " + "session instanceof org.apache.struts2.dispatcher.SessionMap");
		    try {
		        ((org.apache.struts2.dispatcher.SessionMap) session).invalidate();
		    } catch (IllegalStateException e) {
		        e.printStackTrace();
		    }
		}
		return IActionConstants.LOGOUT_SUCCESS; 
	}

}
