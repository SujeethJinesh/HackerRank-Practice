import java.util.Scanner;

/**
 * Created by lab on 2/25/2016.
 */
public class utopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            //This solution manipulates the properties of binary to achieve
            //desired solution!

            String solution = "";
            if (n%2 == 0) {
                for (int i = 0; i < (n+2)/2; i++) {
                    solution += "1";
                }
            }
            else {
                for (int j = 0; j < (n+1)/2; j++) {
                    solution += "1";
                }
                solution += "0";
            }
            System.out.println(Integer.parseInt(solution, 2));
        }
    }
}
