package com.cg.MyMavenProject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	Employee e = new Employee();
    	assertNotNull(e.getEname() == "Kalpesh");
  
    }
}
