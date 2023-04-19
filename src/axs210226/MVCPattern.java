package axs210226;

public class MVCPattern {
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Ankit Sahu");
        student.setRollNo("axs000000");
        return student;
    }

    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Vikram Sharma");

        controller.updateView();
    }
}
