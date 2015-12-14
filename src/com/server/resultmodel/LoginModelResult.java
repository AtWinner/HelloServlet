package com.server.resultmodel;

import com.google.gson.Gson;
import com.server.model.LoginModel;

public class LoginModelResult extends BaseResultModel<LoginModel> {
	
	public LoginModelResult()
	{
		super();
		infor.add(new LoginModel("123456", "12200000000"));
	}
	
	@Override
	public String getObjectJsonStr() {
		Gson gson = new Gson();
		return gson.toJson(LoginModelResult.this);
	}

}
