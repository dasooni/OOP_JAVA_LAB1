package task3to5;

import java.util.Arrays;

public class Calender {
	
	private String[][] data;
	public int counter = 0;
	private int dummy;
	
	public Calender(int size) {
		counter = 0;
		data = new String[size][5];
	}
	
	
	
	public String addPerson(String inString) {
		
		String[] dummy = inString.split(" +");
			//Dummy now contains all people, ex. dummy[0] = "Noah smith"
			if(counter > data.length) 
			{
				return "no";
			} 
			else 
			{
				for(int i = 0; i < data.length; i++) {
				data[counter] = dummy;
				counter++;
				return "person added " + counter;
			}

		}
		return "";
	}
	
	public String[] getName(int entryNumber) {
		String[] name = {"John", "Doe"};
		
		if (-1 <= entryNumber && entryNumber <= counter) 
		{
			name[0] = data[entryNumber][0].toLowerCase();
			name[1] = data[entryNumber][1].toUpperCase();

			return name;
			
		} else 
		{
			
			return name;
		}

}
	public int[] getBirthDate(int entryNumber) {
		int[] date = {1,1,1900};
		
		
		
		if(-1 <= entryNumber && entryNumber <= counter) {
			
			date[0] = Integer.valueOf(data[entryNumber][2]);  
			date[1] = Integer.valueOf(data[entryNumber][3]);
			date[2] = Integer.valueOf(data[entryNumber][4]);
			
			return date;
		}
		else 
		{
			return date; 
		}
	}
	
	
	public String writeName(int number) {
		String month = null;
		dummy = Integer.valueOf(data[number][3]);
		
		switch(dummy) {
		case 1: month = " Jan "; break;
		case 2: month = " feb "; break;
		case 3: month = " march "; break;
		case 4: month = " april "; break;
		case 5: month = " maj "; break;
		case 6: month = " Jun "; break;
		case 7: month = " Jul "; break;
		case 8: month = " aug "; break;
		case 9: month = " sep "; break;
		case 10: month = " okt "; break;
		case 11: month = " nov "; break;
		case 12: month = " dec "; break;
		}
		
		String[] n = getName(number);
		int[] d = getBirthDate(number);

		return Arrays.toString(n).replace("[", " ").replace("]", " ").replace(",", " ") 
				+ "has birthday on " + d[0] + month + d[2];
		//Arrays.toString(d).replace("[", " ").replace("]", " ").replace(",", " ");
	}
	
	public void matchingYear(int year) {
		
			for(int i = 0; i < data.length; i++) {
				int a = Integer.valueOf(data[i][4]);
				if (year == a) {
					
					System.out.println(writeName(i));
				}
				
			}
		}
	
	public void matchingSurname(String surname) {
		
		for(int j=0; j < data.length; j++) {
		String a = data[j][1];
		
			if(surname.contains(a)) {
				System.out.println(writeName(j));
			}
	}
	
	}	
}	
