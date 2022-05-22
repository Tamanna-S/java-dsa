public class NthMagicNum {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1;
            ans += last*base;
            base *= 5;
            n >>= 1;
        }
        System.out.println(ans);
    }
}
