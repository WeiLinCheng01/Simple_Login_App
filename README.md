This is a Login Application made using Java. 
UI is made with Swing 

Necessary Setup. 
  A MySQL Connector is needed. For this project, I used platform independent "mysql-connector-j-9.3.0.jar" 
  which can be found at    https://dev.mysql.com/downloads/connector/j/

  To set up the database, XAMPP was used. That can be found here 
  https://www.apachefriends.org

Start-Up:
  Open XAMPP and start the "MySQL" and "Apache" options 
  Once both are up (highlighted in green), click admin for the row of "MySQL"
  That should bring you to a page with a logo "phpMyAdmin" at the top left 
  click on import and import "loginappDB.sql" from the Database folder
  once that is done, you can run the Java file. The main function is in "GUI.java"

Login Info:
  manager  -------> username: managerlogin
                    password: 0000
  Regular user  --> username: ryanlogin
                    password: 1234
