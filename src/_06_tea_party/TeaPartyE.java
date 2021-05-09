package _06_tea_party;

public class TeaPartyE {
	public class TeaParty {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        //construct greetings to match the TeaPartyETest class so you can greet them correctly
	    	//do i have to make a welcome return statement?
	    	//four different if statements
	    	if(isWoman) {
	    		if(isKnighted) {
	    			return "Hello Lady" + name;
	    		}
	    		else {
	    			return "Hello Ms. " + name;
	    	
	    		}
	    		
	    	}
	    	if(isWoman == false) {
	    	if(isKnighted) {
	    		return "Hello Sir " + name;
	    	}
	    		else {
	    			return "Hello Mr. " + name;
	    		}
	    	}
	    }
	    	//fix later next class. 
	    	
	    	
	    	
	    }
	    
	}
	
	
	

}
