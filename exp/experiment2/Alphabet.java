package experiment2;

public class Alphabet {

	public static void main(String[] args) {
		 int startPosition=0,endPosition=0;        
		 char cStart='a',cEnd='z'; 
		 
		startPosition=(int)cStart;       
		endPosition=(int)cEnd;  
		
		 System.out.println("小写字母表："); 
	       for(int i=startPosition;i<=endPosition;i++){ 
	           char c='\0';           
	           c=(char)i;  
	           System.out.print(" "+c); 
	           if((i-startPosition+1)%8==0) 
	             System.out.println("");   
	        }        
	       System.out.println('\n'+"大写字母表："); 
	       for(int i=startPosition-32;i<=endPosition-32;i++){ 
	           char d='\0';           
	           d=(char)i;  
	           System.out.print(" "+d); 
	           if((i-startPosition-27)%8==0) 
	             System.out.println("");  
	       }
	}

}
