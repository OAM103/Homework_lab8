
public class Ex2{
    public static void main(String[] args) {
        print_range(1, 10);
    }

    private static void print_range(int begin, int N) {

        if (begin <= N) {
            System.out.print(begin + " ");
            begin ++;
            print_range(N, begin);
        }
    }
}
