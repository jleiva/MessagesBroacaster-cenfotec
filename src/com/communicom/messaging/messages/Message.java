package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class Message {
	private LocalDateTime emisionTime;
	private String messageName;
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	
	public Message(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
		this.emisionTime = LocalDateTime.now();
	}
	
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public String getMessageName() {
		return messageName;
	}
	public int getMessageNumber() {
		return messageNumber;
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
}
