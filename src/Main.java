public class Main {

    public static void main(String[] args) {
        double[] blightstone = {-3.5, 9.0, 9.5, -7.6, 4.4, -3.3,8.8, 6.5, -5.6, 3.4, -2.6, -8.0, 6.6, -5.1, 7.9};
        double blink = 0;
        int antimage = 0;
        boolean tilda = false;
        for (double wp : blightstone) {
            if (wp < 0) {
                tilda = true;
            } else if (tilda) {
                antimage++;
                blink += wp;
            }
        }
        System.out.println(blink / antimage);
    }
}
