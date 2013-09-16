package i5.las2peer.services.evaluationService;

import i5.las2peer.api.Service;


/**
 * 
 * This service is used for the evaluation of my bachelor thesis.
 * The "Start Service.bat" start script loads the default LAS2peer agents
 * and registers "adam". Adam then invokes the sendMessages method and this
 * method uses the interval and the total number of messages to generate values
 * from the configuration file and starts generating messages.
 * 
 * @author Peter de Lange
 *
 */
public class EvaluationService extends Service {
	
	
	public int interval; //determines the time between two generated messages
	public long messagesToGenerate; //total number of messages to generate
	
	
	/**
	 * 
	 * Constructor: Loads the property file and enables the service monitoring.
	 * 
	 */
	public EvaluationService(){
		setFieldValues(); //This sets the values of the property file
	}
	
	
	/**
	 * 
	 * This method builds the entry point to this service.
	 * The two parameters interval and messagesToGenerate have to be set by the service's configuration file.
	 * 
	 */
	public void sendMessages(){
		long generatedMessages = 0;
		int printOut = 0;
		System.out.println("");
		System.out.println("");
		System.out.println("Interval is set to " + interval + " ms for each message to be generated");
		System.out.println("Number of messages to be generated is set to " + messagesToGenerate);
		System.out.println("Begin to send messages..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(generatedMessages < messagesToGenerate){
			this.logMessage("Generated message of Evaluation Service");
			if(printOut == 0)
				System.out.println("Generated message number " + generatedMessages);
			generatedMessages++;
			printOut++;
			if(printOut == 1000)
				printOut = 0; // only print every 1000th message since printing comsumes ressources
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}