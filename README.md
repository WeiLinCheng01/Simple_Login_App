This is a Login Application made using Java. 
UI is made with Swing 

Necessary Setup. 
  A MySQL Connector is needed. The Jar file is included in the folder "additional resources". That file is platform independent "mysql-connector-j-9.3.0.jar" 
  which can be downloaded from    https://dev.mysql.com/downloads/connector/j/

  To set up the database, XAMPP was used. That can be found here 
  https://www.apachefriends.org

Start-Up:
  Start up a MySQL server and import loginappDB.sql --- I used XAMPP when building the application. Detailed instructions for that is below. 
  Once the database is up, 2 other actions are needed, including library and updating database information. 
  Open the Java file with your desired IDE (I tested with both VSC and NetBeans and will be including instructions catered for these)
  Navigate to "Libraries" and check that "mysql-connector-j-9.3.0.jar" is present. 
      If "mysql-connector-j-9.3.0.jar" is not present, then add it to the project. For VSC and NetBeans Detailed instructions for that are below.
      
  The next step depends on whether MySQL has been used before. If MySQL has never been used before. There should be no changes required and can simply run the application 
  If MySQL has been set up before, please navigate to lines 51-52 and change the URL, username, and password accordingly. 

Library Instruction for NetBeans: 
  Open project and this project
  Locate the "LoginApp" in the "Projects" tab at the left of the window. 
  Expand the project by clicking on ">" 
  There should be a folder called "Libraries." 
  Right-click that folder and select "Add JAR/Folder..." 
  A file explorer should open, and through this file explorer, navigate to the "additional resources" folder in the project file 
  Select "mysql-connector-j-9.3.0.jar" and click open 
  Follow the prompts and once the JAR file is in the "Libraries" folder then you can continue on with the start-up process. 

Library Instruction for Visual Studio Code:
  Open project and this project
  Locate the "JAVA PROJECT" in the "Explorer" tab. (The "Explorer" tab is on the left while "JAVA PROJECT" is at the bottom of the list in the "Explorer" tab) 
  Expand the project by clicking on ">" beside "LoginApp"
  There should be a folder called "Referenced Libraries" 
  Hover above that folder and select the plus sign that appears to the right of the name 
  A file explorer should open, and through this file explorer, navigate to the "additional resources" folder in the project file 
  Select "mysql-connector-j-9.3.0.jar" and click open 
  Follow the prompts and once the JAR file is in the "Referenced Libraries" folder then you can continue on with the start-up process.
  
Instructions for XAMPP
  Open XAMPP and start the "MySQL" and "Apache" options 
  Once both are up (highlighted in green), click admin for the row "MySQL"
  That should bring you to a page with a logo "phpMyAdmin" at the top left 
  Look for and click on import. 
  Import "loginappDB.sql" from the "additional resources" folder
  Once that is done, follow the rest of the start-up instructions from line 2

Login Info:
  manager  -------> username: managerlogin
                    password: 0000
  Regular user  --> username: ryanlogin
                    password: 1234
