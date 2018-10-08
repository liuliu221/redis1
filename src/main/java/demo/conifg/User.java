package demo.conifg;

public class User {
   private String name;
   private Integer age;
   
   
   public void setName(String name) {
	   this.name=name;
   }
   
   public String getName() {
	   return name;
   }
   
   public void setAge(Integer age) {
	   this.age=age;
   }
   
   public Integer getAge() {
	   return age;
   }

@Override
public String toString() {
	return "User [name=" + name + ", age=" + age + "]";
}
   
   
}
