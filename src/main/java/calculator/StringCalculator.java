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
    		if((input.contains(",") && !input.contains("\n")) && !input.contains(";")) 
    		{
    			String s[] = input.split(",");
    			for(int i = 0 ; i< s.length ; i++)
    			{
    				sum += Integer.valueOf(s[i]);	
    			}	
    		}
    		else if(!input.contains(",") && !input.contains(";"))
    		{
    			sum = Integer.valueOf(input);
    		}
    		else if(input.contains("\n") && !input.contains(";"))
    		{
    			String temp = input.replace("\n", "");
    			String s[] = temp.split(",");
    			
    			for(int i = 0 ; i< s.length ; i++)
    			{
    				if(!s[i].isEmpty() && Integer.valueOf(s[i]) <10) 
    				{	
    					sum += Integer.valueOf(s[i]);
    				}
    				else 
    				{
    					int tem = Integer.valueOf(s[i]);
    					int rem=0;
    					while(tem > 0) 
    					{
    						rem = tem%10;
    						sum += rem;
    						tem = tem/10;
    					}		
    				}	
    			}
    		}
			else
			{
				String temp = input.replaceAll("[^0-9" + 59 + "]", ";");
				String s[] = temp.split(";");
				for (int i = 0; i < s.length; i++) 
				{
					if (!s[i].isEmpty()) 
					{
						sum += Integer.valueOf(s[i]);
					}
				}
			}
    		return sum;
    	}
    }
}