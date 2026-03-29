package Daily_code.day1.ShapeSystem;

public class ShapeSystem {
    public static void main(String[] args) {
        Shape[] s = {
                new Circle("圆",3),
                new Rectangle("长方形",4, 5),
                new Triangle("三角形",4, 3, 4, 5,3),
        };
        System.out.println("得到的图形数据如下===============");

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getShape()+"的面积是："+s[i].area()+",周长是："+s[i].perimeter());
            System.out.println("==============================");
        }
    }
}
