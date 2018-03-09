package CreationPatterns.BuilderPattern_AND_Prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClassRegister implements Cloneable {
    private String mathTeacher;
    private String englishTeacher;

    private int classroom;

    private List<String> students;


    public ClassRegister(String mathTeacher, String englishTeacher,
                         int classroom, List<String> students) {
        this.mathTeacher = mathTeacher;
        this.englishTeacher = englishTeacher;
        this.classroom = classroom;
        this.students = students;
    }


    public static ClassBuilder newClassBuilder() {
        return new ClassBuilder();
    }


    @Override
    public ClassRegister clone() {
        List<String> copyStudents = new ArrayList<>();
        for (String student : this.students) {
            copyStudents.add(student);
        }
        // alternative way:
        // copyStudents.addAll(this.students);

        return ClassRegister.newClassBuilder()
                .setMathTeacher(this.mathTeacher)
                .setEnglishTeacher(this.englishTeacher)
                .setClassRoom(this.classroom)
                .setStudents(copyStudents)
                .createClass();
    }

    // Don't use it, not work
    // students list is only shallow copy (still the same students list as origin)
    public ClassRegister cloneShallow() {
        return ClassRegister.newClassBuilder()
                .setMathTeacher(this.mathTeacher)
                .setEnglishTeacher(this.englishTeacher)
                .setClassRoom(this.classroom)
                // shallow copy the list
                .setStudents(this.students)
                .createClass();
    }

}
