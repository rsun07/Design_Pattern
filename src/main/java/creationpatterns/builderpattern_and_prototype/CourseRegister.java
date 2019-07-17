package creationpatterns.builderpattern_and_prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class CourseRegister implements Cloneable {
    private Teacher teacher;

    private int classroom;

    private List<String> students;


    public CourseRegister(Teacher teacher, int classroom, List<String> students) {
        this.teacher = teacher;
        this.classroom = classroom;
        this.students = students;
    }

    @Override
    public CourseRegister clone() {
        CourseRegister courseRegister = null;
        try {
            courseRegister = (CourseRegister) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return courseRegister;
    }

    // Don't use it, not work
    // students list is only shallow copy (still the same students list as origin)
    public CourseRegister halfDeepClone() {
        return new CourseRegister.CourseBuilder()
                .setTeacher(this.teacher)
                .setClassRoom(this.classroom)
                // shallow copy the list
                .setStudents(this.students)
                .createCourse();
    }

    public CourseRegister deepClone() {
        List<String> copyStudents = new ArrayList<>();
        for (String student : this.students) {
            copyStudents.add(student);
        }
        // alternative way:
        // copyStudents.addAll(this.students);

        return new CourseRegister.CourseBuilder()
                .setTeacher(new Teacher(this.teacher.name))
                .setClassRoom(this.classroom)
                .setStudents(copyStudents)
                .createCourse();
    }

    public static class CourseBuilder {
        private Teacher teacher;

        private int classroom;

        private List<String> students;

        CourseBuilder() {
        }

        public CourseBuilder setTeacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public CourseBuilder setClassRoom(int classroom) {
            this.classroom = classroom;
            return this;
        }

        public CourseBuilder setStudents(List<String> students) {
            this.students = students;
            return this;
        }

        public CourseRegister createCourse() {
            return new CourseRegister(teacher, classroom, students);
        }
    }

    static class Teacher {
        private String name;

        public Teacher(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Teacher teacher = (Teacher) o;
            return Objects.equals(name, teacher.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseRegister that = (CourseRegister) o;
        return classroom == that.classroom &&
                Objects.equals(teacher, that.teacher) &&
                Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacher, classroom, students);
    }
}
