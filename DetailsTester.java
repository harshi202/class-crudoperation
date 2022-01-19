class DetailsTester{
	public static void main (String [] args){
		Details dots [] = new Details[5];
		
		Details dto = new Details(06,  "Harshith",   "harshith@gmail.com", 9902436835l,   "25-04-1996");
		Details dto1 = new Details(15, "santhu",     "santhosh@gmail.com", 12345678910l,  "25-05-1998");
		Details dto2 = new Details(01, "akashth",    "akashth@gmail.com",  9902436835l,   "25-04-1997");
		Details dto3 = new Details(27, "akshay",     "akshay@gmail.com",   12345678910l,  "25-05-1997");
		Details dto4 = new Details(11, "raj",        "raj@gmail.com",      9902436835l,   "25-04-1996");

	
	
		
		
		dots[0] = dto;
		dots[1] = dto1;
		dots[2] = dto2;
		dots[3] = dto3;
		dots[4] = dto4;
		
		
		
	
		Detailsmethods.add(10,"leg","leg@gmail.com",12345678910l,"25-04-1999");
		Detailsmethods.printall();
		Detailsmethods.updatebyName("akashth","joy");
		Detailsmethods.printall();
		Detailsmethods.deleteByName("raj");
		Detailsmethods.printall();
		
		
	
		
		for (int index=0;index<dots.length;index++){
			System.out.println(dots[index].id +" \t "+ dots[index].name +" \t "+ dots[index].email +" \t "+ dots[index].DOB +" \t "+dots[index].phnumber);
		}
	
	}
}