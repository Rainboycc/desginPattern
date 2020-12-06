package com.clay.state_pattern;

public class ThreadContext {
    private ThreadState state;

    public ThreadContext () {
        state = new New();
    }

    public void setState (ThreadState ts) {
        state = ts;
    }

    public ThreadState getState() {
        return state;
    }
    public void start() {
        ((New) state).start(this);
    }
    public void getCPU() {
        ((Runnable) state).getCPU(this);
    }
    public void suspend() {
        ((Running) state).suspend(this);
    }
    public void stop() {
        ((Running) state).stop(this);
    }
    public void resume() {
        ((Blocked) state).resume(this);
    }

}
