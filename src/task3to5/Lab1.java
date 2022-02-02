package task3to5;

//import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		DataBase myData = new DataBase();
		
		String theDataBase =  myData.toString();
		
		String names[] = theDataBase.toString().split(",");
		
		Calender theCalendar = new Calender(names.length);
		

		
		
		//System.out.println(theDataBase);
		
		//Scanner sc = new Scanner(theDataBase);
		//sc.useDelimiter("[, ]");
		//while(sc.hasNext()) {
		   // if(sc.hasNextInt()) {
		     //   int readInt = sc.nextInt();
		        //System.out.println(readInt);
		   // } else {
		       // String readString = sc.next();
		        //System.out.println(readString);
		    //}
		//}
		
		//System.out.println(theDataBase);
		
		for(int i=0; i < names.length; i++) {
		String list = theCalendar.addPerson(names[i]);	
		System.out.println(list);
		}
		
		for(int j=0; j < names.length; j++) {
			
			int[] birthdays = theCalendar.getBirthDate(j);
			String[] allnames = theCalendar.getName(j);
			
			System.out.println(java.util.Arrays.toString(allnames).replace("]", " ").replace("[", " ").replace(",", " "));
			//System.out.println(java.util.Arrays.toString(birthdays).replace("]", " ").replace("[", " ").replace(",", "/"));
			System.out.println("Day: " + birthdays[0] + " Month: " + birthdays[1] + " Year:" + birthdays[2]);
			
		}
		theCalendar.matchingYear(1945);
		theCalendar.matchingSurname("Jones");
	}

}
