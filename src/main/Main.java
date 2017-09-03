package main;

import javax.security.auth.login.LoginException;
import modules.*;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.JDABuilder;

@SuppressWarnings("unused") //Disables a warning for me during development which arises because the modules package is empty
public class Main{
    public static void main(String[] args) throws LoginException, RateLimitedException, InterruptedException{
        JDA jda = new JDABuilder(AccountType.BOT).setToken(Constants.token).buildBlocking();
        BuiltinLoader.loadBuiltins(jda);
        BuiltinLoader.loadRuntimeVariables(jda);
        
        for(Object module:Constants.modules){
            jda.addEventListener(module);
        }
    }
}