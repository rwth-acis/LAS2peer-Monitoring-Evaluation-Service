package i5.las2peer.services.evaluationService;

import i5.las2peer.api.Service;


/**
 * 
 * This service is used for the evaluation of my bachelor thesis.
 * 
 * 
 * @author Peter de Lange
 *
 */
public class EvaluationService extends Service {
	
	
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
	 * This method builds the entry point to this service. All parameters will be
	 * set by the service's config file.
	 * 
	 */
	public void sendMessages(){
		System.out.println("Begin to send messages..");
		while(true){
			System.out.println("Next round..");
		}
	}
	
	
}