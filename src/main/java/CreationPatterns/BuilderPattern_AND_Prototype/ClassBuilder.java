package CreationPatterns.BuilderPattern_AND_Prototype;

import java.util.List;

public final class ClassBuilder {
    private String mathTeacher;
    private String englishTeacher;

    private int classroom;

    private List<String> students;

    public ClassBuilder() {

    }

    public ClassBuilder setMathTeacher(String teacher) {
        this.mathTeacher = teacher;
        return this;
    }

    public ClassBuilder setEnglishTeacher(String teacher) {
        this.englishTeacher = teacher;
        return this;
    }

    public ClassBuilder setClassRoom(int classroom) {
        this.classroom = classroom;
        return this;
    }

    public ClassBuilder setStudents(List<String> students) {
        this.students = students;
        return this;
    }

    public ClassRegister createClass() {
        return new ClassRegister(mathTeacher, englishTeacher, classroom, students);
    }

}
