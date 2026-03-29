package gym.gym_exercise;

public class StrengthMember extends Member {
    public double weight;
    public int sets;

    public StrengthMember(String name, int age, String gender, double weight, int sets) {
        super(name, age, gender);
        this.weight = weight;
        this.sets = sets;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    double calculateCalories(){
    return weight * sets * 5;
    }

    double calculateIntensity(){
    return (weight * sets) / 50;
    }

    String getTrainingDetail(){
    return "力量训练：重量"+weight+"kg,"+"组数"+sets+"组";
    }

}
