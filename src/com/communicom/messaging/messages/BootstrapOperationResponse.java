package com.communicom.messaging.messages;

public class BootstrapOperationResponse extends Message {
	private String version;
	private int resul;
	private String errorMessage;

	public BootstrapOperationResponse() {
		super(6, "BootstrapOperationResponse");
	}
	
	public String getVersion() {
		return version;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public int getResul() {
		return resul;
	}

	private String manageErrorMessage() {
		return resul == 0 ? "Error" : "";
	}

}
