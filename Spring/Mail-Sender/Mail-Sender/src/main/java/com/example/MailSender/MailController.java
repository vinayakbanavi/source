package com.example.MailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.internet.MimeMessage;

@RestController
public class MailController 
{
	@Autowired
	private JavaMailSender mail;
	
	@RequestMapping("sendMail")
	public String sendMail() throws Exception
	{
//		Create Mime Message
		MimeMessage mime = mail.createMimeMessage();
		
//		Create a mime message helper
		MimeMessageHelper helper = new MimeMessageHelper(mime);
		
//		Now set all the parameters
		helper.setTo("prathamvc2001@gmail.com");
		helper.setSubject("MailSender Project");
		helper.setText("Stop Using Your Mobile");
		
//		sends the mail
		mail.send(mime);
		
		return "mail sent successfully";
	}
}
