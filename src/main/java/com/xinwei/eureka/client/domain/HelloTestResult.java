package com.xinwei.eureka.client.domain;

import java.io.Serializable;

public class HelloTestResult implements Serializable {

	private int returnCode;

	private String returnMsg;

	public HelloTestResult() {
		super();
	}

	public int getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	@Override
	public String toString() {
		return "HelloTestResult [returnCode=" + returnCode + ", " + (returnMsg != null ? "returnMsg=" + returnMsg : "")
				+ "]";
	}

}
