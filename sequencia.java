public class sequencia {
    
    static long f(int n) {
        return (n < 2) ? n : f(n -1) + f(n -2);
    } 

    public static void main(String[] args){
        for(int i = 0; i < 20; i++) {
            System.out.println("(" + i + "):" + sequencia.f(i));
        }
    }
}
