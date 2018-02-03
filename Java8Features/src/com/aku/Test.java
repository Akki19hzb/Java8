package com.aku;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
			List<Integer> list = Arrays.asList(5, 99, 87, 66, 31, 23, 54, 88, 73,1, 4, 8, 20, 90, 6, 65, 94);
			
			
			System.out.println("Numbers above 50 that are even:");
			list.stream()
			.filter(i->i>50 && i%2==0)
			.forEach(i->System.out.print(i+" "));
			
			System.out.println("\n\nSquare of Numbers above 50 that are Odd:");
			list.stream()
			.filter(i->i>50 && i%2!=0)
			.forEach(i->System.out.print(i*i+" "));
			
			List<Person> people = Arrays.asList(
							new Person("Shawn","Michaels",31,"Male"),
							new Person("Eva","Summer",48,"Female"),
							new Person("Tom","Schultz",24,"Male"),
							new Person("Sylvia","Brady",16,"Female"),
							new Person("Michael","Schumacher",33,"Male"),
							new Person("Lovelyn","Rose",29,"Female"),
							new Person("Don","Hertz",43,"Male"),
							new Person("Amy","Summers",23,"Female"),
							new Person("Dorothy","Sanders",37,"Female"),
							new Person("Alex","Koffman",25,"Male")
							);
			System.out.println("\n\nname of all the male persons: ");
			people.stream()
			.filter(p ->p.getGender().equals("Male"))
            .map(pm ->pm.getFirstname()+" "+pm.getLastname())
            .forEach(System.out::println); 
			
			System.out.println("\n\nname of all the persons with 'A'  or 'S': ");
			people.stream()
			.filter(p ->p.getFirstname().startsWith("A")||p.getFirstname().startsWith("S"))
            .map(pm ->pm.getFirstname()+" "+pm.getLastname())
            .forEach(System.out::println);
			
			
			people.stream()
			.mapToDouble(p->p.getAge())
			.average()
			.ifPresent(avg->System.out.println("\nAverage Age:"+ avg));
			
			System.out.println("\n\nname of all the persons above 30 ");
			people.stream()
			.filter(p ->p.getAge()>30)
            .map(pm ->pm.getFirstname()+" "+pm.getLastname())
            .forEach(System.out::println);
			
			
			
	}

}
