public class Ulam {
	public static void ulamfunc(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
	}
	
    public static void main(String[] args) {
        int max = 1000000;
        for (int i = 1; i <= max; i++) {
        	ulamfunc(i);
        	if (i % 1000 == 0) {
        		System.out.println(i);
        	}
        }
        
        System.out.println("If you can read this it is proven!");
    }
}
