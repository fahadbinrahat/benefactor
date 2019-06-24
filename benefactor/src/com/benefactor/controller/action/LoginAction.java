package com.benefactor.controller.action;

import java.util.Map;

import com.benefactor.core.user.access.UserAccessManager;
import com.benefactor.core.user.access.UserNotFoundException;
import com.benefactor.core.user.common.UserDetails;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {

	private String username;
	private String password;

	public String execute() {

		UserAccessManager uam = new UserAccessManager();
		UserDetails ud = new UserDetails();
		ud.setUserName(getUsername());
		ud.setPassword(getPassword());

		try {
			ud = uam.retrieveUser(ud);

			if (ud != null) {
				Map session = (Map) ActionContext.getContext().get("session");
				session.put("userobj", ud);
				return IActionConstants.LOGIN_SUCCESS;
			} else {
				return IActionConstants.LOGIN_FAILURE;
			}

		} catch (UserNotFoundException unfe) {
			return IActionConstants.LOGIN_FAILURE;
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
