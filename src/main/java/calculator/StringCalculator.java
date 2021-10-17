package calculator;

class StringCalculator {

	public int add(String input) {
    	if(input.isEmpty())
    	{
    		return 0;
    	}
    	else 
    	{
    		int sum = 0;
    		if(input.contains(",")) 
    		{
    			String s[] = input.split(",");
    			for(int i = 0 ; i< s.length ; i++)
    			{
    				sum += Integer.valueOf(s[i]);	
    			}
    			
    		}
    		else
    		{
    			sum = Integer.valueOf(input);
    		}
    		return sum;
    	}
    }

}