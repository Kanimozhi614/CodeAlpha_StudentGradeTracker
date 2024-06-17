# StudentGradeTracker

This Java program is a simple and user-friendly console-based application for tracking student grades. It supports entering grades for multiple students, viewing all entered grades, displaying statistics such as average, highest, and lowest grades, and editing grades for a student.

Features
Grade Entry: Allows users to enter grades for multiple students.
Grade Viewing: Displays all entered grades for each student.
Statistics: Calculates and displays average, highest, and lowest grades for each student.
Grade Editing: Enables users to edit an existing grade for a student.
User-Friendly Menu: Provides a menu-driven interface for easy navigation.
Input Validation: Ensures valid inputs for grade and student operations.
Modular Design: Clean and modular design with class-based structure and helper methods.
Design
Class-Based Structure:

Student: Represents a student with attributes such as name and a list of grades. It includes methods for adding grades, calculating average, highest, and lowest grades.
StudentGrades: Contains the main program logic and methods for menu-driven operations such as entering grades, displaying grades, displaying statistics, and editing grades.
Menu Display Method: The main method uses a loop and a switch-case statement to display the menu and handle user choices.

Input Validation: Ensures valid user inputs for number of students, grades, and menu choices.

Error Handling: Handles invalid choices and non-existent students gracefully.

Looping Mechanism: The program runs in a loop until the user chooses to exit.

Output Formatting: Provides clear and formatted output for the results of each operation.

Graceful Exit: Exits gracefully with a message when the user chooses to exit.
