# libraryManagement
 **About:**  
 This program is a back-end REST application for a library management system that was creates using Spring Boot and connects to a MySQL database. This system will allow the librarian to be able to add in new books, delete books, search by books by title, genre, or author. It will also allow the librarian to be able to add in new users who wish to gain access to the library and be able to borrow books and update or delete user information. For each book that is added a new entry in the Borrow table is automatically created that will be used to determine who is currently borrowing each book.  
 
 **Requirements:**  
 Java 11  
 Spring Boot: 2.5.3  
 MySQL Database  
 Hiberate: 5  
 
 **Spring Boot Dependencies:**  
 Spring Boot Actuator  
 Spring Boot Web  
 Spring Boot Data JPA  
 MySQL Connector  
 
 **Database Schema:**  
 ![image](https://user-images.githubusercontent.com/43048860/127787835-3621dc5d-7ebd-4826-94dc-99239437d29a.png)  
 
 Book Trigger: This trigger will automatically result in an insertion action being called into the borrow table whenever there is a new book that is created. The new entry in the borrow table can then be updated as needed whenever a user decides to borrow the book from the library.    
 ![image](https://user-images.githubusercontent.com/43048860/127787953-57db41d9-aea5-4712-934b-cc9848c0bf8e.png)  
 
 User Trigger: This trigger will automatically result in the borrow and book tables being updated whenever a user is about to be deleted from the database. The books that the user have borrowed will be returned, this will result in the book table being updated to show that the book is not available and the borrow table will be updated to show that no one is currently borrowing the book.  
 ![image](https://user-images.githubusercontent.com/43048860/127788084-2ff34a67-d58b-4f19-afbb-7222861a6fc1.png)  
 
 Borrow Trigger: This trigger will automatically update the book table whenever a user wants to borrow a book. The "available" column in the book table is updated to show that the book is not available.  
 ![image](https://user-images.githubusercontent.com/43048860/127788150-05236e85-9eb0-4b87-81ee-47270a5f580d.png)  
 
 Note: The borrow and return date columns in the borrow table are in the form of "yyyy-mm-dd".  
 
 **Connecting to Database:**  
 In order to connect Spring Boot to your MySQL Database you first need to have the MySQL Connector and Spring Data JPA dependencies added to your project. After doing so add the following to your application.properties file located in src/main/resources.  
![image](https://user-images.githubusercontent.com/43048860/127788272-4373be85-a88a-4ea0-a142-3fc323e79947.png)  
Replace the userName, Password, and URL information with your MySQL login information and the name of the database that you wish to connect to. Note that the naming specifications in the image above will result in you being able to map your entity properties to the specified columns without worry of using the wrong naming convention. By default Hibernate will create a new column in your database with snakecase naming if you attempt to map to a column that uses camelcase naming convention. The naming specifications above will ensure that does not happen.  


**Testing:**  
In order to test this application Postman is the recommended way to do so. Postman is an API client that can be used to test an API, and it is useful as it can handel data in JSON, XML, & Plain Text data forms.
