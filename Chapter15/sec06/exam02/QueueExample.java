package ch15.sec06.exam02;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
	public static void main(String[] args) {
		
	Queue<Message> messageQueue = new LinkedList<>();
		
	messageQueue.offer(new Message("SendMail", "jack"));
	messageQueue.offer(new Message("SendSMS", "adam"));
	messageQueue.offer(new Message("SendLine", "aya"));
		
	while(!messageQueue.isEmpty()) {
		Message message = messageQueue.poll();
		switch(message.command) {
		  case "SendMail" :{
			 System.out.println(message.to + "님에게 메일을 보냅니다");
			   break;
		   }
			  
		  case "SendSMS" : {
			 System.out.println(message.to + "님에게 SMS을 보냅니다");
			   break;
		   }
			  
		  case "SendLine" :{
			   System.out.println(message.to + "님에게 카카오톡을 보냅니다");
				break;
		   }
			  
		 }
			
	   }	
	  
	}

  }
