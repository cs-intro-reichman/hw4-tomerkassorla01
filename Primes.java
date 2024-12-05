public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[] primeArr = new boolean[N+1]; 
        for (int i = 2; i < N + 1; i++) {
            primeArr[i] = true;
        }
        int p = 2;

        while (p * p <= N) {
            if (primeArr[p])
            {
                int i = p * p;
                while (i <= N) {
                    primeArr[i] = false;
                    i += p;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + N + ":");
        int primeCounter = 0;
        for (int i = 2; i <= N; i++) {
            if (primeArr[i]) {
                System.out.println(i);
                primeCounter++;
            }
        }
        int percentage = primeCounter * 100 / N;
        System.out.println("There are " + primeCounter + " primes between 2 and " + N + " (" + percentage + "% are primes)");
    }
}