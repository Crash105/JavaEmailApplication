# Java Email Application

## Project Overview

This Java application allows organizations to easily create email accounts for new employees based on their specific department. The project demonstrates object-oriented programming principles, particularly encapsulation, to create a robust and maintainable email generation system.

## Key Features

1. Automatic email address generation
2. Department-specific email creation
3. Random password generation
4. Ability to change password
5. Set mailbox capacity
6. Define alternate email address
7. Display user information

## Implementation Details

### The Email Class

The core of the application is the `Email` class, which encapsulates all the necessary methods and variables for email account creation and management.

#### Private Variables

- `firstname`: String
- `lastname`: String
- `password`: String
- `department`: String
- `email`: String
- `mailCapacity`: int
- `alternateEmail`: String

#### Constructor

The constructor takes the employee's first name, last name, and department as parameters. It then:

1. Sets the name variables
2. Calls private methods to:
   - Set the department
   - Generate a random password
   - Create the email address

#### Private Methods

- `setDepartment()`: Prompts user to choose department
- `randomPassword()`: Creates a random string for the initial password
- `generateEmail()`: Combines name, department, and company suffix to create email address

#### Public Methods

- `setMailCapacity()`: Sets the mailbox capacity
- `setAlternateEmail()`: Sets an alternate email address
- `changePassword()`: Allows the user to change their password
- `getMailCapacity()`: Returns the mailbox capacity
- `getAlternateEmail()`: Returns the alternate email
- 'getPassword()': Returns password
- `getEmail()`: Returns the email address
- `showInfo()`: Displays all the user's information

## Usage Example

```java
Email en1 = new Email("John", "Smith");
User is then prompt to choocse from 4 options for departments:
- Sales
- Development
- Accounting
- None
User Selects Sales
System.out.println(en1.showInfo());
```

This would create a new email for John Smith in the Sales department and display his information.

## Benefits of Encapsulation

By using encapsulation:

1. The internal workings of the Email class are hidden from outside code.
2. We can control how the data is accessed and modified.
3. We can change the internal implementation without affecting external code.
4. It provides better organization and modularity of the code.

## Conclusion

This Java Email Application demonstrates how to use object-oriented programming principles to create a practical, real-world application. It showcases the power of encapsulation in creating maintainable and flexible code.
