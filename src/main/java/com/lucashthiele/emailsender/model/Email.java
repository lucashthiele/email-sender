package com.lucashthiele.emailsender.model;

public class Email {
    private String fromEmailAddress;
    private String fromName;
    private String toEmailAddress;
    private String subject;
    private String emailBody;

    public Email() {
    }

    public Email(String fromEmailAddress, String fromName, String toEmailAddress, String subject, String emailBody) {
        this.fromEmailAddress = fromEmailAddress;
        this.fromName = fromName;
        this.toEmailAddress = toEmailAddress;
        this.subject = subject;
        this.emailBody = emailBody;
    }

    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    public String getFromName() {
        return this.fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmailBody() {
        return this.emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    public String getToEmailAddress() {
        return this.toEmailAddress;
    }

    public void setToEmailAddress(String toEmailAddress) {
        this.toEmailAddress = toEmailAddress;
    }

    public String toString() {
        return "Email{fromEmailAddress='" + this.fromEmailAddress + "', fromName='" + this.fromName + "', toEmailAddress='" + this.toEmailAddress + "', subject='" + this.subject + "', emailBody='" + this.emailBody + "'}";
    }
}
