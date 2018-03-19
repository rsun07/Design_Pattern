package behavioralpattern.templatepattern;

public class ConcreteSteps1 extends Template {

    @Override
    public void step1() {
        System.out.println("Step 1 in ConcreteSteps1");
    }

    @Override
    public void step2() {
        System.out.println("Step 2 in ConcreteSteps1");
    }

    @Override
    public void step3() {
        System.out.println("Step 3 in ConcreteSteps1");
    }
}
