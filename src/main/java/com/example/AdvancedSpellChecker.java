package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:/application.properties")
class AdvancedSpellChecker implements InitializingBean, DisposableBean, SpellChecker{

    @Value("${app.database.uri}")
    private String databaseUri;

    @Override
    public void checkSpelling(String emailMessage){
        if (emailMessage!=null){
            System.out.println("Advanced spelling check ...");
            System.out.println("Spell check complete!!");

            System.out.println("DB URI is: "+ databaseUri);
        } else {
            throw new RuntimeException("An exception occurred while checking the spelling.");
        }
    }

    //from the DisposableBean interface
    @Override
    public void destroy() throws Exception {
        System.out.println(">>>> inside AdvancedSpellChecker DisposableBean.destroy()");
    }

    //from the InitializingBean interface
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(">>>> inside AdvancedSpellChecker InitializingBean.afterPropertiesSet()");
    }
}