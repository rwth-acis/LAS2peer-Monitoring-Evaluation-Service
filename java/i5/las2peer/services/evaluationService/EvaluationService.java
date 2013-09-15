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
	 * Constructor: Loads the property file and enables the service monitoring.
	 */
	public EvaluationService(){
		setFieldValues(); //This sets the values of the property file
	}
	
}