
Essential tools:

	1. Java Development Kit (JDK): Ensure you have JDK installed. You can download it from the Oracle website(https://www.oracle.com/java/technologies/javase-downloads.html).
	2. Selenium JAR files: Download the Selenium server standalone JAR file from the Selenium website(https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.22.0/selenium-server-4.22.0.jar).
	
Environment setup:

	1. Go to the settings after that search environment variable 
	2. Click: Edit the system environment variables 
	3. click: environment variables in advanced section
	4. click: new in user variable section after that set variable name JAVA_HOME and set vale java path (exapmple: C:\Program Files\Java\jdk-21)
	5. click: path in system variables section after that click edit
	6. click: new and give the java bin address for exapmple C:\Program Files\Java\jdk-21\bin 
	7. click: all apply and ok
	
Run program:

	1. create project folder
	2. move source code java file(eg: Test.java) in this folder and move selenium jar file in this folder (eg: selenium-server-4.22.0.jar).
	3. open that project folder and right click in the folder after that select open in terminal option
	4. terminal would open.
	5. write command like this syntax javac -cp jarFileNameWithExtention.jar sorurceFileNameWithExtention.java 
		exapmple: javac -cp selenium-server-4.22.0.jar Test.java
		press enter key.
	6. write command like this syntax java -cp jarFileNameWithExtention.jar sorurceFileNameWithExtention.java 
		exapmple: java -cp selenium-server-4.22.0.jar Test.java
		press enter key.
		
Note: Fully automation is not possible so some events you should do manually. don't take code not working.
