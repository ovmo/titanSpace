package test;

import org.junit.Test;
import simulator.ODEFunction;
import simulator.RungeKuttaSolver;
import simulator.State;
import titan.StateInterface;

class ODEFunctionTest {
    static final double ACCURACY = 2875700; // titan


    @Test
    void testRungeKuttaX()
    {
        int accuracyRK = 100;
        RungeKuttaSolver rungeKutta = new RungeKuttaSolver();
        ODEFunction odeF = new ODEFunction();
        State y0 = new State();
        y0.initializeState();
        int t = 0; // time point
        int h = 8; // Step size
        StateInterface rungeKuttaStep = rungeKutta.step(odeF, t, y0, h);
        // assertEquals(expected, rungeKuttaStep.state[3][0].getX(), accuracyRK)
    }

    public static void main(String[] args) {
        RungeKuttaSolver rungeKutta = new RungeKuttaSolver();
        ODEFunction odeF = new ODEFunction();
        State y0 = new State();
        y0.initializeState();
        int t = 0; // time point
        int h = 8; // Step size
        State rungeKuttaStep = (State)(rungeKutta.step(odeF, t, y0, h));
        System.out.println(rungeKuttaStep.state[11][0].getX());
    }
}
