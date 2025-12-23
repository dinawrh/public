public class tanjent {

    static double f1(double t) {
        return t * t + t;
    }

    static double f2(double t) {
        return t * t + 2 * t;
    }

    static double f3(double t) {
        return t * t + 3 * t;
    }

    static double df1(double t) {
        return 2 * t + 1;
    }

    static double df2(double t) {
        return 2 * t + 2;
    }

    static double df3(double t) {
        return 2 * t + 3;
    }

    public static void main(String[] args) {

        System.out.println("Motion of particles from t = -6 to t = 6");
        System.out.println("----------------------------------------");

        for (int t = -6; t <= 6; t++) {
            System.out.println("t = " + t +
                    " | f1 = " + f1(t) +
                    " | f2 = " + f2(t) +
                    " | f3 = " + f3(t));
        }

        int t0 = 0;

        System.out.println("\nTangent line information at common point:");
        System.out.println("----------------------------------------");
        System.out.println("Common point: t = " + t0 + ", value = 0");

        System.out.println("Particle 1 slope = " + df1(t0));
        System.out.println("Particle 2 slope = " + df2(t0));
        System.out.println("Particle 3 slope = " + df3(t0));
    }
}