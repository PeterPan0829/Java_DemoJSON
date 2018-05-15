package JSON_Test;

public class PeopleBean {
    private String name;
    private int age;
    private boolean gender;

              public PeopleBean(String name, int age, boolean gender) {
                 setPeopleBean(name, age, gender);
             }

             public String getName() {
                 return name;
             }

             public void setName(String name) {
                 this.name = name;
             }

             public int getAge() {
                 return age;
             }

             public void setAge(int age) {
                 this.age = age;
             }

             public boolean getGender() {
                 return gender;
             }

             public void setGender(boolean gender) {
                 this.gender = gender;
             }

             /***************************************************************/
             public void setPeopleBean(String name, int age, boolean gender) {
                 setName(name);
                 setAge(age);
                 setGender(gender);
             }

         }


