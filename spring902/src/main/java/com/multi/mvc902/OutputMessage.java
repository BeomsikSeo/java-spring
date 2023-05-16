package com.multi.mvc902;

// 서버에서 받은 데이터를 채팅창에 들어와 있는 멤버 브라우저에게
// 보낼 데이터를 넣을 vo ==> messageBroker가 json으로 만들어서 브라우저에 보낸다.
// @sendTo("topic/messages")
public class OutputMessage {
	
	private String from;
	private String text;
	private String time;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
