package com.covid;
class Severity{
	  
	  String exceptionType;
	    int errorCode;
	    String severity;
  public Severity(String exceptionType, int errorCode, String severity) {
		super();
		this.exceptionType = exceptionType;
		this.errorCode = errorCode;
		this.severity = severity;
	}
	 
	public String getExceptionType() {
		return exceptionType;
	}
	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
  
  
}