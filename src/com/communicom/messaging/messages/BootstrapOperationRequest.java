package com.communicom.messaging.messages;

public class BootstrapOperationRequest extends Message {
	private String version;

	public BootstrapOperationRequest() {
		super(5, "BootstrapOperationRequest");
	}
	
	public String getVersion() {
		return version;
	}

}
