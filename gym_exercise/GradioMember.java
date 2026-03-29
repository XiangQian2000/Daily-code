package gym.gym_exercise;

public class GradioMember extends Member{
    public double duration;
    public double distance;

    public GradioMember(String name, int age, String gender, double duration, double distance) {
        super(name, age, gender);
        this.duration = duration;
        this.distance = distance;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    double calculateCalories(){
    return distance * 60;
    }

    double calculateIntensity(){
    return (distance * 10.0) / duration;
    }

    String getTrainingDetail(){
    return "有氧训练：时长"+duration+"分钟,"+"距离"+distance+"km";
    }
}
