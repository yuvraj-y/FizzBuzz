public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int n = 100;
        while (n>0){

            boolean is_even = n % 2 == 0;

            if (is_even){
                n = n / 2;
            }
            else {
                n = n - 1;
            }
            steps = steps + 1;
        }

        System.out.println(steps);
    }
}
