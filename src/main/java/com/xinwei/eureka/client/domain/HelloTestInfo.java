package com.xinwei.eureka.client.domain;

import java.io.Serializable;
import java.util.Date;

public class HelloTestInfo implements Serializable {

	private long testId;

	private String testName;

	private String testVersion;

	private Date testDate;

	public HelloTestInfo() {
		super();
	}

	public long getTestId() {
		return testId;
	}

	public void setTestId(long testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestVersion() {
		return testVersion;
	}

	public void setTestVersion(String testVersion) {
		this.testVersion = testVersion;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	@Override
	public String toString() {
		return "HelloTestInfo [testId=" + testId + ", " + (testName != null ? "testName=" + testName + ", " : "")
				+ (testVersion != null ? "testVersion=" + testVersion + ", " : "")
				+ (testDate != null ? "testDate=" + testDate : "") + "]";
	}

}
