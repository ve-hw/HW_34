package core;


import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Subtract3ParameterizedTest {

	
    @Parameters(name = "Parameter # {index}: {1} + {2} + {3} = {0}")
    public static Collection<Double[]> addNumbers() {
           return Arrays.asList(new Double[][] {
                       {5.0, 10.0, 2.0, 3.0},
                       {10.0, 22.0, 3.0, 9.0}, 
                       {19.0, 33.0, 4.0, 10.0}, 
                       {205.0, 410.0, 5.0, 200.0},

           });}
    @Parameter(value = 0) public Double expected;
    @Parameter(value = 1) public Double first;
    @Parameter(value = 2) public Double second;
    @Parameter(value = 3) public Double third;
    @Test
    public void divide() {
           System.out.println(first + " - " + second + " - " + third + " = " + expected);
           assertEquals("Not correct", Calculator.subtract(first, second, third), expected, 0.09);
   }

}