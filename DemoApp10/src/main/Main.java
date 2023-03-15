package main;
//Only one constructor inside another constructor
//this keyword is used to call the other constructors inside a constructor.
//this keyword should be the first line of the constructor.
public class Main {
	
	   static {
		   System.out.println("Who is the first one to execute?");
	   }
	  
       Main(){
    	   System.out.println("Manohar reached here without executing this...");
       }
       Main(int a){
    	   this(4,5);
    	   System.out.println("Manohar is printing:"+a);
       }
       Main(int a,int b){
    	   this(); 
    	   System.out.println(a+" and "+b);
       }
       
       public static void main(String[] args) {
		 Main m1=new Main(4); 
		 System.out.println("Completed...");
	  }
}
