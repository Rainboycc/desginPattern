package com.clay.template_themod_pattern;

public abstract class HookAbstractClass {

    public void SpecificMethod () {
        System.out.println("抽象类中的具体方法");
    }

    public void HookMethod1 () {
    }

    public boolean HookMethod2 () {
        return true;
    }

    public abstract void abstractMethod1 ();
    public abstract void abstractMethod2 ();

    public void TemplateMethod () {
        abstractMethod1();
        HookMethod1();
        if (HookMethod2()) {
            SpecificMethod();
        }
        abstractMethod2();
    }
}
