package com.server.resultmodel;

import java.awt.List;
import java.util.ArrayList;

/**
 * 
 * @author CoderHu
 * @datetime 2015年12月14日 下午4:16:26
 * Email:hufanglin@gmail.com
 */
public abstract class BaseResultModel<T>
{
	protected boolean success;
	protected String msg;
	protected ArrayList<T> infor = new ArrayList<T>();
	
	public BaseResultModel()
	{
		success = false;
		msg = "失败了！";
	}
	
	public abstract String getObjectJsonStr();

	public boolean isSuccess() {
		return success;
	}

	public String getMsg() {
		return msg;
	}

	public ArrayList<T> getInfor() {
		return infor;
	}
	
	
}
