package behavioralpattern.templatepattern;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void test() {
        Template concreteStep1 = new ConcreteSteps1();
        Template concreteStep2 = new ConcreteSteps2();


        concreteStep1.runIt();

        System.out.println();
        concreteStep2.runIt();
    }
}
