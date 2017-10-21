package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.factory.FactoryMessage;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.signals.MessageType;

public class MessageController {
	private ArrayList<Message>messagesList = new ArrayList<Message>();
	
	public void sendMessage(MessageType tipoMensage) {
		Message message = FactoryMessage.crearMensaje(tipoMensage);
		messagesList.add(message);
	}

	public void listMessage() {
		for (Message currentRequest: messagesList){
			System.out.println(currentRequest.toString());
		}
	}

}
