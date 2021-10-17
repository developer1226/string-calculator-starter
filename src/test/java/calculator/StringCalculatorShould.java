package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorShould 
{
    @Test
    public void empty_string_should_return_0() 
    {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void string_with_single_number_should_return_number_as_int()
    {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    public void string_with_double_number_should_return_number_as_sum() 
    {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    public void string_with_unknown_number_should_return_number_as_sum() 
    {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(32+52+45+85+20, stringCalculator.add("32,52,45,85,20"));
    }
    
    @Test
    public void string_with_newLine_between_two_number_should_return_number_as_sum() 
    {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }
}
