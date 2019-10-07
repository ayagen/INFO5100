package com.neu.q2;
class PsychiatristObject {
	//asks a moody object about its mood  
	public void examine(MoodyObject moodyObject) {
		System.out.println("How are you feeling today?");
		moodyObject.queryMood();
	}

	//a moodyObject is observed to either laugh or cry  
	public void observe(MoodyObject moodyObject) {
		moodyObject.expressFeelings();
		System.out.println("Observation: " + moodyObject);
	}
	
	public static void main(String[] args) {
		PsychiatristObject psychiatrist = new PsychiatristObject();
		
		MoodyObject happyObject = new HappyObject();
		psychiatrist.examine(happyObject);
		psychiatrist.observe(happyObject);
		
		
		MoodyObject sadObject = new SadObject();
		psychiatrist.examine(sadObject);
		psychiatrist.observe(sadObject);
	}
}