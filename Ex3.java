

public class Ex3 {
    public static void main(String[] args) {
        int A = 10;
        int B = 3;
        print_range(A, B);
    }
    private static void print_range(int A, int B) {

        if (A < B) {
            print_range(A, B-1);
            System.out.print(B + " ");

        }
        else if (A > B) {
            System.out.print(A + " ");
            print_range(A-1, B);
        }
        else{
            System.out.print(A + " ");
        }
    }
}
