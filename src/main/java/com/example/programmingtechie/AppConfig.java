package com.example.programmingtechie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
public class AppConfig {
//    @Bean(name = "basicSpellChecker")
//    public BasicSpellChecker createBasicSpellChecker(){
//        return new BasicSpellChecker();
//    }
//
//    @Bean(name = "advancedSpellChecker")
//    public AdvancedSpellChecker createAdvancedSpellChecker(){
//        return new AdvancedSpellChecker();
//    }
//
//    @Bean(name = "emailClient")
//    public EmailClient createEmailClient(){
//        //constructor injection
//       // return new EmailClient(createAdvancedSpellChecker());
//
//        //setter injection
//        EmailClient emailClient = new EmailClient();
//        emailClient.setSpellChecker(createAdvancedSpellChecker());
//        return emailClient;
//    }
}
