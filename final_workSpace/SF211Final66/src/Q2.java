// Name (in English): Sabig Benmumin
// ID: 6510742197

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Q2 {
	public static void main(String[] args) {
		// uncomment line by line to test your code
		HappyBirthday bList = new HappyBirthday();
		System.out.println(bList);
		bList.add("Bella", 8, 12, 2009);
		bList.add("Jaguar", 9, 7, 2009);
		bList.add("Jesse", 1, 10, 2011);
		bList.add("Lindsay", 8, 9, 2011);
		bList.add("Laurent", 8, 9, 2011);
		bList.add("Margie", 8, 22, 2013);
		bList.add("Margie", 1, 1, 1);
		System.out.println(bList);
		System.out.println("Jaguar is born on " + bList.getDate("Jaguar"));
		System.out.println("jaguar is born on " + bList.getDate("jaguar"));
		System.out.println("Born in August:");
		for (String name : bList.getNames(8))
			System.out.println("\t" + name);
		System.out.println("Born on August, 9, 2011:");
		for (String name : bList.getNames(8, 9, 2011))
			System.out.println("\t" + name);
		if (bList.remove("Lindsay"))
			System.out.println(bList);
		if (bList.remove("Lindsay"))
			System.out.println(bList);
	}
}

/* Given classes, DO NO MODIFIED */
class SimpleDate {
	private static final DecimalFormat F = new DecimalFormat("00");
	private int month;
	private int day;
	private int year;

	public SimpleDate(int mm, int dd, int yy) {
		month = mm;
		day = dd;
		year = yy;
	}
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear(){
		return year;
	}

	public String toString() {
		return F.format(month) + "/" + F.format(day) + "/" + F.format(year);
	}

	public boolean equals(Object d) {
		if (!(d instanceof SimpleDate))
			return false;
		SimpleDate d1 = (SimpleDate) d;
		return (month == d1.month && day == d1.day && year == d1.year);
	}
}

class Birthdate {
	private String name;
	private SimpleDate date;

	public Birthdate(String name, int mm, int dd, int yy) {
		this.name = name;
		this.date = new SimpleDate(mm, dd, yy);
	}

	public String getName() {
		return name;
	}

	public SimpleDate getDate() {
		return date;
	}

	public String toString() {
		return name + " - " + date;
	}
}

// WRITE YOUR CODE HERE
class HappyBirthday {
	private ArrayList<Birthdate> birthdayList;
	public HappyBirthday(){
		birthdayList = new ArrayList<>();
	}
	public boolean searchName(String name){
		for(Birthdate b: birthdayList){
			if(b.getName() == name) return true;
		}
		return false;
	}
	public void add(String name, int m, int d, int y){
		if(!(searchName(name))) birthdayList.add(new Birthdate(name,m,d,y));
	}
	public boolean remove(String name){
		for (Birthdate b: birthdayList){
			if(b.getName().equals(b)){
				birthdayList.remove(b);
				return true;
			}
		}
		return false;
	}
	public SimpleDate getDate(String name){
		for(Birthdate b: birthdayList){
			if(b.getName().equals(name)){
				return b.getDate();
			}
		}
		return null;
	}
	public ArrayList<String> getNames(int mm){
		ArrayList<String> names = new ArrayList<>();
		for (Birthdate b: birthdayList){
			int mon = getDate(b.getName()).getMonth();
			if (mon == mm){
				names.add(b.getName());
			}
		}
		return names;
	}
	public ArrayList<String> getNames(int dd, int mm, int yyyy){
		ArrayList<String> names = new ArrayList<>();
		for (Birthdate b: birthdayList){
			int mon = getDate(b.getName()).getMonth();
			int day = getDate(b.getName()).getDay();
			int year = getDate(b.getName()).getYear();
			if ((mon == mm)&&(day == dd) && (year == yyyy)){
				names.add(b.getName());
			}
		}
		return names;
	}
	public String toString(){
		if (birthdayList.size() == 0) return "I have no friedns";
		String e = birthdayList.get(0) + "";
		for (int i = 1; i < birthdayList.size() ; i++){
			e += "\n" + birthdayList.get(i);
		}
		return e;
	}
}