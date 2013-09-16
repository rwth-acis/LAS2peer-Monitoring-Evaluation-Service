cd ..
set BASE=%CD%
set CLASSPATH="%BASE%/lib/*;"

java -cp %CLASSPATH% i5.las2peer.testing.L2pNodeLauncher windows_shell -s 9012 192.168.1.116:9010 startObserver uploadStartupDirectory uploadAgents  registerUserAgent('-5021131362343084485','adamspass') startService('i5.las2peer.services.evaluationService.EvaluationService','evaluationServicePass') invoke('i5.las2peer.services.evaluationService.EvaluationService','sendMessages') shutdown
pause