package com.lucashthiele.emailsender.services;

import com.lucashthiele.emailsender.model.Email;
import jakarta.mail.MessagingException;
import java.io.UnsupportedEncodingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListenerService {
    @Autowired
    EmailSenderService emailSenderService;

    @KafkaListener(
            topics = {"EMAIL_SENDER"},
            groupId = "groupId",
            containerFactory = "factory"
    )
    void listener(Email email) {
        try {
            System.out.println("Enviando...");
            this.emailSenderService.send(email);
        } catch (UnsupportedEncodingException | MessagingException var3) {
            throw new RuntimeException(var3);
        }
    }
}
