package d3.corejava;

import java.util.*;

 
public class Test implements Comparable<Test>,Comparator<Test>{
	   volatile int n;
 
	   Test(int n){
		   this.n = n;
	   }
	   
       public static void main(String[] args) {
    	   
    	System.out.println("In main method");
    	Test t = new Test(3);
    	System.out.println(t.n);
    	/*Test t1 = new Test();
    	
    	Test t2 = new Test();
    	
    	t1.n = 1;
    	t2.n = 2;*/
    	
    	System.out.println(Runtime.getRuntime().totalMemory()/1024);
    	System.out.println(Runtime.getRuntime().freeMemory());
    	System.out.println(Runtime.getRuntime().maxMemory());
    	System.out.println(Runtime.getRuntime().freeMemory()+Runtime.getRuntime().totalMemory());
    	   
    	String name = "Deep";
    	System.out.println(name.substring(1));
    	//2   
    	/*Map<String, String> unsortMap = new HashMap<String, String>();
   		unsortMap.put("2", "B");
   		unsortMap.put("1", "A");
   		unsortMap.put("4", "D");
   		unsortMap.put("3", "B");
   		unsortMap.put("7", "C");
   		unsortMap.put("5", "z");
   		unsortMap.put("6", "b");
   		unsortMap.put("8", "a");
   		
   		
   		System.out.println(unsortMap.entrySet());
   		System.out.println(unsortMap.keySet());
   		
   		
   		List list = new LinkedList(unsortMap.entrySet());
   		for(Iterator it = list.iterator(); it.hasNext();){
   			Map.Entry entry = (Map.Entry)it.next();
    		System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());	
   		}*/
   		
    	   
         //3    
              /*Calendar cal = Calendar.getInstance();
              int hourOfTheDay = cal.get(Calendar.HOUR);
             
              String secret = "Password";
             
              System.out.println(secret);
             
              String encToken1 = "";
              String encToken2 = "";
              String encToken3 = "";
             
              StrongPasswordEncryptor spe = new StrongPasswordEncryptor();
             
              encToken1 = spe.encryptPassword(secret);
              encToken2 = spe.encryptPassword(secret);
              encToken3 = spe.encryptPassword(secret);
             
              // This token needs to be generated and included in the jsp page
              // The token is basically encrypted secret phase stored in the config file 
              // but because the salt is used the token has different value every time.
             
              System.out.println("Start");
              System.out.println(encToken1);
              System.out.println(encToken2);
              System.out.println(encToken3);
              System.out.println("Done creating tokens");
             
              // The method in the web service will check if the token is valid using the checkPassword method
              // The secret will be supplied in the
             
              System.out.println(spe.checkPassword(secret, encToken1));
              System.out.println(spe.checkPassword(secret, encToken2));
              System.out.println(spe.checkPassword(secret, encToken3));
              System.out.println("Done");*/
       }
 static{
	 System.out.println("Inside static block");
 }
@Override
public int compare(Test o1, Test o2) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int compareTo(Test o) {
	// TODO Auto-generated method stub
	return 0;
}
}