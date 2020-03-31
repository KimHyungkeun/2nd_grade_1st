package Question2;

public class Person
{
   private String firstName;
   private String lastName;
   private int age;

   public Person (String newFirstName, String newLastName, int newAge)
   {
      firstName = newFirstName;
      lastName = newLastName;
      age = newAge;
   }
   
   public String getFirstName() 
   {
       return firstName;
   }
   
   public String getLastName() 
   {
       return lastName;
   }
   
   public int getAge() 
   {
       return age;
   }
   
   public boolean equals(Object obj)
   {
	   Person p = (Person) obj;
	   
	   if(this.firstName == p.firstName && this.lastName == p.lastName && this.age == p.age)
		   return true;
	   
	   else
		   return false;
   }
   
  }

