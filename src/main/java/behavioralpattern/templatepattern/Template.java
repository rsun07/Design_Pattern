package behavioralpattern.templatepattern;

public abstract class Template {
    // This is the template method
    // which won't be override by subclasses
    // It defines the steps
    public void runIt() {
        step1();
        step2();
        step3();
    }

    // These are step method,
    // which should be override by subclasses
    public abstract void step1();
    public abstract void step2();
    public abstract void step3();

}
