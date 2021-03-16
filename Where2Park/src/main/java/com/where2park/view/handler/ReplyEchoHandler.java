package com.where2park.view.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class ReplyEchoHandler extends TextWebSocketHandler{
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("afterConnectionEstablished : " + session);
	}//커넥션이 연결 되었을 때 타고 들어오는 메소드
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

	}//메세지를 보냈을때 타고 들어가는 메소드 
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

	}//커넥션이 클로즈 되었을때 타는 메소드
}
