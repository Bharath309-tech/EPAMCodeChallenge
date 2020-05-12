package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MESSAGE")
public class Message {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int messageId;
private int messageType;
private String message;
public int getMessageId() {
	return messageId;
}
public void setMessageId(int messageId) {
	this.messageId = messageId;
}
public int getMessageType() {
	return messageType;
}
public void setMessageType(int messageType) {
	this.messageType = messageType;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}


}
