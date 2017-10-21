package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest {
	private String messageName;
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	
	public PingServerRequest(){
		this.messageName = "PingServerRequest";
		this.messageNumber = 1;
		this.emisionTime = LocalDateTime.now();
	}
	
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public int getMessageNumber() {
		return messageNumber;
	}
	public String getMessageName() {
		return messageName;
	}
	
}
