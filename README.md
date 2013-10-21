LAS2peer-Monitoring-Evaluation-Service
======================================

This service is used to measure the speed and capabilities of the monitoring concept of LAS2peer.  
The "Start Service.bat" start script loads the default LAS2peer agents and registers "adam".  
"Adam" then invokes the "sendMessages" method and this method uses the interval and the total number of messages to generate values 
from the configuration file and starts generating messages.