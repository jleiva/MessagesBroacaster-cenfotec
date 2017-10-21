package com.communicom.messaging.messages;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalResponse extends Message {
	private SignalType signal;
	private String signalExpectedValue;
	private String signalReceivedValue;
	
	public SetWaitForSignalResponse(){
		super(4, "SetWaitForSignalResponse");
	}

	public SignalType getSignal() {
		return signal;
	}
	public void setSignal(SignalType signal) {
		this.signal = signal;
	}
	public String getSignalExpectedValue() {
		return signalExpectedValue;
	}
	public void signalExpectedValue(String signalExpectedValue) {
		this.signalExpectedValue = signalExpectedValue;
	}
	public String getSignalReceivedValue() {
		return signalReceivedValue;
	}
	public void setSignalReceivedValue(String signalReceivedValue) {
		this.signalReceivedValue = signalReceivedValue;
	}
	
}
