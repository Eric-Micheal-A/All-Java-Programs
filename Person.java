import java.util.*;
class Person
  {
      String name;
      int age;
    void set(String name,int age)
    {
      this.name=name;
      this.age=age;
    }
    void show()
    {
      System.out.println("Name "+name+" with age "+age);
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,age;
      String name;
      Person p=new Person();
      n=d.nextInt();
      for(int i=0;i<n;i++)
        {
          name=d.next();
          age=d.nextInt();
          p.set(name,age);
          p.show();
        }
    }
  }