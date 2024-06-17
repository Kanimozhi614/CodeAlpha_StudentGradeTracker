import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    ArrayList<Double> grades;

    Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    void addGrade(double grade) {
        grades.add(grade);
    }

    double getAverage() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    double getHighest() {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    double getLowest() {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}

 class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n====== Student Grade Tracker ======");
            System.out.println("1. Enter grades");
            System.out.println("2. View all grades");
            System.out.println("3. View statistics (average, highest, lowest)");
            System.out.println("4. Edit a grade");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    enterGrades(scanner, students);
                    break;
                case 2:
                    displayGrades(students);
                    break;
                case 3:
                    displayStatistics(students);
                    break;
                case 4:
                    editGrade(scanner, students);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void enterGrades(Scanner scanner, ArrayList<Student> students) {
        System.out.print("\nEnter the number of students: ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            Student student = new Student(name);

            System.out.print("Enter the number of grades for " + name + ": ");
            int numberOfGrades = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < numberOfGrades; j++) {
                System.out.print("Enter grade " + (j + 1) + " for " + name + ": ");
                double grade = Double.parseDouble(scanner.nextLine());
                student.addGrade(grade);
            }
            students.add(student);
        }
    }

    public static void displayGrades(ArrayList<Student> students) {
        System.out.println("\nGrades entered:");
        for (Student student : students) {
            System.out.print("Student: " + student.name + ", Grades: ");
            for (double grade : student.grades) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
    }

    public static void displayStatistics(ArrayList<Student> students) {
        System.out.println("\nStatistics:");
        for (Student student : students) {
            System.out.println("Student: " + student.name);
            System.out.println("Average grade: " + student.getAverage());
            System.out.println("Highest grade: " + student.getHighest());
            System.out.println("Lowest grade: " + student.getLowest());
        }
    }

    public static void editGrade(Scanner scanner, ArrayList<Student> students) {
        System.out.print("\nEnter the student's name to edit the grade: ");
        String name = scanner.nextLine();
        Student studentToEdit = null;

        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)) {
                studentToEdit = student;
                break;
            }
        }

        if (studentToEdit != null) {
            System.out.print("Enter the grade number to edit (1 to " + studentToEdit.grades.size() + "): ");
            int gradeIndex = Integer.parseInt(scanner.nextLine()) - 1;

            System.out.print("Enter the new grade for " + name + ": ");
            double newGrade = Double.parseDouble(scanner.nextLine());
            studentToEdit.grades.set(gradeIndex, newGrade);
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
