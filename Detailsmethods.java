class Detailsmethods{
	static void add(int id, String name,String email,long phnumber,	String DOB ){
	System.out.println(id +"\t"+ name +"\t"+ email +"\t"+ phnumber +"\t"+ DOB );
	}
static String []name = {"harshith","santhu","akashth","akshay","raj"};
	
	static void updatebyName (String oldname, String DOB){
		for (int index =0;index<name.length;index++){
			if(oldname.equals(name[index]))
				name [index]= DOB;
	
	    }
    }
	 static void printall(){
		for (int index =0;index<name.length;index++ ){
			System.out.println(name[index]);
		}
		System.out.println();
	}
	
	static void deleteByName(String names){
		for(int index=0;index<name.length;index++){
			if (name [index].equals(names))
				name[index]=null;
		}
	}
		
}	
	 
	 
	
	
	
	
	 
		
	
	
	
    
	
	
			
