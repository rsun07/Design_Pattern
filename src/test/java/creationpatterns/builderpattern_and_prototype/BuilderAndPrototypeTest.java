package creationpatterns.builderpattern_and_prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuilderAndPrototypeTest {
    private CourseRegister courseRegister;

    @Before
    public void before() {
        this.courseRegister = new CourseRegister.CourseBuilder()
                .setTeacher(new CourseRegister.Teacher("John"))
                .setClassRoom(101)
                .setStudents(Arrays.asList("Mike", "Young", "Kangkang"))
                .createCourse();
    }

    @Test
    public void testShallowCopy() {
        CourseRegister classRegisterCopy = courseRegister.clone();
        Assert.assertEquals(courseRegister, classRegisterCopy);
        Assert.assertSame(courseRegister.getTeacher(), classRegisterCopy.getTeacher());
    }

    @Test
    public void testHalfDeepCopy() {
        CourseRegister classRegisterCopy = courseRegister.halfDeepClone();
        Assert.assertEquals(courseRegister, classRegisterCopy);
        Assert.assertNotSame(courseRegister, classRegisterCopy);
        Assert.assertSame(courseRegister.getTeacher(), classRegisterCopy.getTeacher());
    }

    @Test
    public void testDeepCopy() {
        CourseRegister classRegisterCopy = courseRegister.deepClone();
        Assert.assertEquals(courseRegister, classRegisterCopy);
        Assert.assertNotSame(courseRegister, classRegisterCopy);
        Assert.assertNotSame(courseRegister.getTeacher(), classRegisterCopy.getTeacher());
    }
}
