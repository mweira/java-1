class TestaFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial = fatorial * i;
            System.out.println("Fatorial de " + i + " = " +fatorial);
        }
    }
}

//i = 1 f = 1 
//i = 2 f = 2 
//i = 3 f = 6 
//i = 4 f = 24 
//i = 5 f = 120 