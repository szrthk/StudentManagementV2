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
2. Created DTO StudentResponse
    Used - @lombok.value: It makes the class final, generate getter setter, ensure data integrity
    @lombok.Builder: Provides a fluent, readable way to create objects, especially useful when you have multiple optional fields
    

### Step 3 
1. Creating not found Exception in student
    why - custom exception used when a requested resource is not found in the system
        a.  instead of throwing random exception, we throw specific exception which tells us whats wrong
        b. provides meaningfull error message to api consumer 

    What if we dont use exception handling ?
        We will get generic error codes instead of meaningful errors,
        example: Student with id 123 not found" vs "RuntimeException

2. Creating StudentService in student/service
    why - defines what operations can be performed on students
        Your StudentService interface is:
            ✅ Defining a contract for student operations
            ✅ Enabling loose coupling between layers
            ✅ Making your code testable and maintainable
            ✅ Following Spring Boot best practices for service layer design

3. Creating StudentServiceimp in student service
    why -  adding the logic behind the creation of student and saving his record