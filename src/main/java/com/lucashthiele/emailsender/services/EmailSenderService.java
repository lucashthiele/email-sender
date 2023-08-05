package com.lucashthiele.emailsender.services;

import com.lucashthiele.emailsender.model.Email;
import java.io.UnsupportedEncodingException;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public EmailSenderService() {
    }

    public void send(Email email) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = this.mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setFrom(email.getFromEmailAddress(), email.getFromName());
        helper.setTo(email.getToEmailAddress());
        helper.setSubject(email.getSubject());
        helper.setText(email.getEmailBody(), true);
        this.mailSender.send(message);
    }
}
