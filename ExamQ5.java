final class ExamSingleton {
 
    private static ExamSingleton INSTANCE;
     
    private ExamSingleton() {        
    }
     
    public static ExamSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ExamSingleton();
        }
         
        return INSTANCE;
    }
    
    public String tellJoke() {
    	String joke = "Why do java programmers wear glasses?\r\n" + 
    			"Because they can’t C#";
    	
    	return joke;
    			
    }
}

public class ExamQ5 {

	public static void main(String[] args) {
		ExamSingleton single = ExamSingleton.getInstance();
		System.out.println(single.tellJoke());
		
	}
}
