class helicopterTester{
	public static void main (String [] args){
		
		helicopter chopper = new helicopter ("deccan",300,10,"white");
		System.out.println(chopper.name+"\t"+chopper.speed+"\t"+chopper.capacity+"\t"+chopper.colour);
		
		helicopter copter = new helicopter ("redline",380, 9,"blue");
		System.out.println(copter.name+"\t"+copter.speed+"\t"+copter.capacity+"\t"+copter.colour);
		
		helicopter king = new helicopter ("kingofair",400,10,"gray");
		System.out.println(king.name+"\t"+king.speed+"\t"+king.capacity+"\t"+king.colour);
		
		helicopter chopper1 = new helicopter ("blueline",300,10,"red");
		System.out.println(chopper1.name+"\t"+chopper1.speed+"\t"+chopper1.capacity+"\t"+chopper1.colour);
		
		helicopter chopper2 = new helicopter ("oceanking",300,20,"white");
		System.out.println(chopper2.name+"\t"+chopper2.speed+"\t"+chopper2.capacity+"\t"+chopper2.colour);
		
	}
}