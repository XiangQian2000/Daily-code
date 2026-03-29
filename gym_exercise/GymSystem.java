package gym.gym_exercise;

public class GymSystem {
    public static void main(String[] args) {


        Member[] m = {
                new StrengthMember("张三", 25, "男",60,5),
                new StrengthMember("李四", 30, "女",47,6),
                new GradioMember("王五", 28, "男",50,5),
                new GradioMember("赵六", 29, "女",40,5),
        };
        System.out.println("健身房信息如下：===============");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].displayInfo()+m[i].getTrainingDetail()+",卡路里消耗："+m[i].calculateIntensity()+"，强度计算："+m[i].calculateCalories());
            System.out.println("==============================");
        }

    }
}