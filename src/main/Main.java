package main;

import javax.security.auth.login.LoginException;
import modules.*;
import builtinModules.*;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.JDABuilder;

public class Main{
    public static void main(String[] args) throws LoginException, RateLimitedException, InterruptedException{
        JDA jda = new JDABuilder(AccountType.BOT).setToken(Constants.token).buildBlocking();
        jda.addEventListener(new ChatLogger());
    }
}