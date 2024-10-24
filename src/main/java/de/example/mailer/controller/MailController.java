package de.example.mailer.controller;

import de.example.mailer.services.MailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    final MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping
    public void sendMail(){
        mailService.sendMail("silversurfer@ohne.surfboard", "Kauf dir mal ne Board", ""
        + "Hallo Silver Surfer, darfst du dich überhaupt Silver Surfer nennen, obwohl gar kein Surfboard hast?");
    }
}
