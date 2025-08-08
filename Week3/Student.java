class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;


    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

 
    void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    
    public static void main(String[] args) {
       
        Student student = new Student();

      
        student.name = "Ashik";
        student.rollNumber = 101;
        student.marks = 87.5;

       
        student.printStudentInfo();
    }
}
