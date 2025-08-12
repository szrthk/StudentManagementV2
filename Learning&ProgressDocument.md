# StudentManagementV2 (PROD Ready)
## Hi this is Sarthak (szrthk) and this document is by me for me and nothing else, I am building this to revise my learning and to learn more things. Also will be making this small project as PROD ready implementing everything.
### Step 1
1. Created StudentEntity.java inside student/model
why - this contains all the parameters we require in context of the "Student". For example - id, name, age, email. 
We used - 
1. @NoArgsConstructor - because it automatically generates a constructor with no parameters.
2. @AllArgsConstructor - because it generates a constructor with parameters for all field.
3. @ToString -  returns string representation of objects with all field values.
4. @Document("student") - maps this class to mongodb collection named "student".

Why we used these @ thingy -  
These Lombok annotations significantly reduce boilerplate code. Without them, we need to manually write:
A no-args constructor
An all-args constructor
A toString method
Getter and setter methods for each field. 
Also I get confused writing this bs, thanks to lombok.

2. Created StudentRepositery inside student/repo and extended it to mongorepositery
why - gives us CRUD without writing boilerplate

3. Configured application.properties and set up w mongodb

4. Created a test.java files w few params just to test mongodb is working properly or not.

### Step 2
1. Created DTO StudentCreate