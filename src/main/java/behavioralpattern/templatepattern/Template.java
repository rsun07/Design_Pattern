package behavioralpattern.templatepattern;

public abstract class Template {
    public void runIt() {
        step1();
        step2();
        step3();
    }

    public abstract void step1();
    public abstract void step2();
    public abstract void step3();

}
