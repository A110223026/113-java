public class GradeBookTest {
    public static void maim(String[] args) {
        final int NUMBER_OF_STUDENT = 3;
        Student[] students = new Student[NUMBER_OF_STUDENT];
        students[0] = new Student("A112221009", "黃繼田");
        students[1] = new Student("A112221010", "陳宏明");
        students[2] = new Student("A112221011", "林志林");
        GradeBook gradeBook = new GradeBook("Java程式設計", students, NUMBER_OF_STUDENT);
        gradeBook.processStudentsGrades();
        gradeBook.displayMessage();
    }
}
