//Author Ankan 
class Q8{
	 static void forloop(){
		System.out.println("*Using For Loop*");
		for(int i=1;i<=10;i++){                   //Method for For loop
			System.out.println(i);
		}
	}
	 static void whileloop(){
		System.out.println("*Using While Loop*");
		int i=1;                                  
		while(i<=10){
			System.out.println(i);
			i++;
		}
	}
	 static void dowhileloop(){
		System.out.println("*Using Do-While Loop*");
		int i=1;
		do{
			System.out.println(i);
			i++;
		}
		while(i<=10);
	}
	public static void main(String[]args){
		forloop();                                    
		whileloop();
		dowhileloop();
	}
}