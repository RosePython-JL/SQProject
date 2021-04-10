package org.gcalc;

import org.apache.log4j.BasicConfigurator;
import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class EquationTest {

    @Test
    //testing evaluate function in equation class
    public void evaluate() {
        BasicConfigurator.configure();
        Equation equation = new Equation("x-1");
        assertEquals (-2,(int)equation.evaluate(-1)[0]);
    }

    @Test
    public void testInstruction() {

        Instruction instruction=new Instruction(Instruction.InstType.ADD,"sfsxc");

    }
    @Test
    public void testNullInstruction() {
        Instruction instruction=new Instruction(null,null);
        assertEquals(instruction.instruction, null);

    }

    @Test
    public void testEquation(){
        Equation equation = new Equation("3 + 32 * x / 3 ");

    }
    @Test(expected = NullPointerException.class)
    public void testEquationIsEmpty(){
        Equation equation = new Equation(null);

    }



}