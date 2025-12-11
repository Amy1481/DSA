// WAP to calculate volume of cube,cuboid,sphere,cone,cylinder
public class Q3 {
    public static void main(String[] args) {
        double side=3.2;
        System.out.println(side*side*side);

        double length=1.8;
        double base=5.6;
        double height=8.2;
        System.out.println(length*base*height);

        double radius=4.9;
        double height_cyl=6.6;
        System.out.println(3.141*radius*radius*height_cyl);

        double radius_cone=8.3;
        double height_cone=5.1;
        System.out.println((3.14*radius_cone*radius_cone*height_cone)/3);

        double radius_sphere=7.6;
        System.out.println(1.33*3.141*radius_sphere*radius_sphere*radius_sphere);
    }
}
