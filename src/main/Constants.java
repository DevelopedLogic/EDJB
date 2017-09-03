package main;

public interface Constants{
	//Generalised bot settings
	public static final String token = ""; //Token the bot uses to sign into its bot account
	public static final String[] developerIDs = {"312269489850941450"/*DevelopedLogic*/}; //Public IDs of the users who are allowed access to the Developer Only commands
	public static String prefix = "?!"; //Bot's prefix. Not final so it can be changed by a command during execution
	public static final String botName = "EDJBot";
	
	//Optional built-in modules
	public static final boolean enableChatLogging = false;
	public static final boolean enableInfo = true;
}