public class NTo1 {
    public static void main(String[] args) {
        concept(5);
    }

    static void fun(int n) {
        if(n ==0){
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
    static void fun2(int n) {
        if(n ==0){
            return;
        }
        fun2(n - 1);
        System.out.println(n);
    }
    static void concept(int n) {
        if(n ==0){
            return;
        }
        System.out.println(n);
//        concept(n --);
        concept(n-1);
    }
}
