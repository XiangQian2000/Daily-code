package Daily_code.day1.gym_exercise;

public class Member {
    public String name;
    public int age;
    public String gender;

    public Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    String displayInfo(){
    return "姓名："+name+","+age+"岁,"+gender;
    }

    String getTrainingDetail(){
    return "";
    }

     double calculateCalories(){
    return 0;
    }

    double calculateIntensity(){
    return 0;
    }
}
