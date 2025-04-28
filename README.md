# Project One: Contact, Task, and Appointment Services

## How can I ensure that my code, program, or software is functional and secure?
I start by writing unit tests that cover every requirement, including valid cases and expected failures. In JUnit I create tests that try both correct and incorrect inputs, 
so I know nothing slips through untested. For example, I test that a phone number of exactly ten digits is accepted and any other length throws an error. This gives me confidence 
that each piece of logic works as intended. To keep code secure, I also think about edge cases where malicious or unexpected data could enter the system. Even though these services 
are in-memory, I validate all inputs and throw exceptions on anything that doesn’t meet the rules. In a larger system I would also add integration tests and authorization checks.

## How do I interpret user needs and incorporate them into a program?
I begin by gathering the requirements and writing them down as clear rules: “appointment dates must never be in the past” or “contact IDs must be unique and up to ten 
characters.” Then I turn each rule into at least one unit test before writing the code. This helps me stay focused on what the user asked for, because 
each test maps back to a specific requirement.

## How do I approach designing software?
First I break the problem into small classes: Contact, Task, and Appointment. I define the public interface and the validation rules before writing 
implementation. Next, I write unit tests for each method and validation rule. Once the tests are passing, I refactor the code to get rid of duplication and improve 
readability, without changing the behavior.
