# AbsaAssessment

Task 1 - API

Requirements:

1. download java 8
https://www.java.com/en/download/

2. Download Jmeter v4.0
https://jmeter.apache.org/download_jmeter.cgi

3. Download Jmeter Plugin manager
https://jmeter-plugins.org/wiki/PluginsManager/

4. Install Jmeter v4.0 and Plugin manager.

5. Reopen Jmeter after Plugin manager is installed

6. In Jmeter navigate to Options tab and select Plugin mananager from the list.

7. Add the following plugins:
 - Jason Plugin
 - xml plugin
 
 8. Clone AbsaAssement Reposeory to Local PC.
 
 9. open "AbsaTask1.jmx" in jmeter
 
 10. Execute the jmeter script by clicking on the Green start button /icon below the menu bar.
 
 11. Results will be desplayed in the "Results Tree" Listener
 
 
 Task 2 - Web
 
 Requirements:
 
 1. Download Eclipse IDE
 http://www.eclipse.org/downloads/packages/release/oxygen/2/eclipse-ide-java-developers
 
 2. Download Java 8 JDK 
 https://java.com/en/download/
 
 3. Download Selenium webdriver for Java
 https://www.seleniumhq.org/download/
 
 4. download Google Chrome Driver ( I Have used Chrome as my browser of choice for this task)
 https://chromedriver.storage.googleapis.com/index.html?path=2.41/
 
 5. All downlaoded files need to be installed on Local PC.
 5.1 Install Java JDK and JRE
 5.2 Install eclipse
 5.3 Extract Selenium webdriver to local area on PC. eg " C:\Selenium"
 5.4. copy downloaded Chrome Driver exe file to local area on PC , this can be copied to the same location as Selenium eg. "C:\Selenium
 
 6. Open Eclipse IDE
 6.1 open AbsaTaks2 Project
 6.2 Right Click on Project name  and select properties
 6.3 select Java Build path and navigate to Libaries tab
 6.4 Ensure JRE System Library is listed
 6.5 Select "add External Jars" and open folder on Local PC where Selenium Jar files have been extrated to Ensure all Jar files have     been imported including the files in the "Lib" sub folder.
 
 7. Envoking Chrome Browser to the scrypt
 7.1 Check ib each class of the project if System Properties is pointing to the correct path on the local pc for Chrome Drive exe file
 
 8. Project Notes
 I have created a class for each question for this task as follows:
 
- Question 1.
Navigate to - http://www.way2automation.com/angularjs-protractor/webtables/
Class Name: SiteNav.java

-Question 2
Validate that you are on the User List Table
Class Name: validateUserListTable.java

-Question 3
Click Add user
Class Name: AddUserButton.java

-Question 4
Add users with the following details
Class Name: addUserDetails.java

-Question 5
Ensure that User Name (*) is unique on each run
Class Name: UniqueUserId.java

-Question 6
Ensure that your users are added to the list
Class Name: ValidateNewUsers.java







 
 
 
 
 
 
 
 
