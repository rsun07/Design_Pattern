package CreationPatterns.BuilderPattern_AND_Prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BuilderAndPrototypeTest {
    private ClassRegister classRegister;

    @Before
    public void before() {
        this.classRegister = ClassRegister.newClassBuilder()
                .setMathTeacher("John")
                .setEnglishTeacher("Hong")
                .setClassRoom(101)
                .setStudents(Arrays.asList("Mike", "Young", "Kangkang"))
                .createClass();
    }

    @Test(expected = AssertionError.class)
    public void testShallowCopy() {
        ClassRegister classRegisterShallowCopy = classRegister.cloneShallow();
        Assert.assertEquals(classRegisterShallowCopy.getClassroom(), classRegister.getClassroom());

        boolean studentIdentical = classRegisterShallowCopy.getStudents() == classRegister.getStudents();
        System.out.println(studentIdentical);
        try {
            Assert.assertFalse(studentIdentical);
        } catch (AssertionError e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Test
    public void testDeepCopy() {
        ClassRegister classRegisterShallowCopy = classRegister.clone();
        Assert.assertEquals(classRegisterShallowCopy.getClassroom(), classRegister.getClassroom());

        boolean studentIdentical = classRegisterShallowCopy.getStudents() == classRegister.getStudents();
        System.out.println(studentIdentical);
        Assert.assertFalse(studentIdentical);
    }
}
