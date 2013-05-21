How to use logging.properties file in java.util.logging ?

Set the properties file path as below in the command line :

$java -Djava.util.logging.config.file=enter/the/path MainClass

If your an eclipse user then 

1. Right click on the program and got to Run As.
2. select Run Cofigurations.
3. In the pop up menu select the Arguments tab.
4. In the vm arguments enter the following command, for example
   -Djava.util.logging.config.file=/home/vyasarajv/sample_workspace/com.pramati.sample/resource/logging.properties
5. enter apply and run.   

