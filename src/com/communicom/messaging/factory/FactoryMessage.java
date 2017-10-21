package com.communicom.messaging.factory;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.MessageType;

public final class FactoryMessage {
	public static Message crearMensaje(MessageType tipoMensage) {
		if (MessageType.PING_REQUEST.equals(tipoMensage)){
			return new PingServerRequest();
		}
		if (MessageType.PING_RESPONSE.equals(tipoMensage)) {
			return new PingServerResponse();
		}
		if (MessageType.SET_WAIT_SIGNALREQ.equals(tipoMensage)) {
			return new SetWaitForSignalRequest();
		}
		if (MessageType.SET_WAIT_SIGNALRES.equals(tipoMensage)) { 
			return new SetWaitForSignalResponse();
		}
		if (MessageType.BOOSTRAP_REQ.equals(tipoMensage)) { 
			return new BootstrapOperationRequest();
		}
		if (MessageType.BOOSTRAP_RES.equals(tipoMensage)) { 
			return new BootstrapOperationResponse();
		}
		
		return null;
	}
}
