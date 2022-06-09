public class Main {
    public static void main(String[] args) {
        double[] statist{-0.5,3.5,6.8,4.5,3.9,-0.8,-0.5,7.9,-22.3,21.3,1.2,3.7,4.3,6.7,4.4};
        double wp = 0;
        int lucky = 0;
        boolean hook = false;
        for (double numbers : statist) {
            if (numbers > 0) {
                lucky++;
                wp += numbers;
            }
        }
        System.out.println(wp / lucky);

    }
}