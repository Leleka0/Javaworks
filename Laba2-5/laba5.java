public class laba5 {
    public static void main(String[] args) {
        int n = 4, m = 5;
        int[][] N = new int[n][m];
        int[] P = new int[m]; 

        
        System.out.println("Масив N:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                N[i][j] = (int)(Math.random() * 100); 
                System.out.print(N[i][j] + "\t");
            }
            System.out.println();
        }

        
        for (int j = 0; j < m; j++) {
            P[j] = 1;
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (N[i][j] >= 10 && N[i][j] < 55) {
                    P[j] *= N[i][j];
                    found = true;
                }
            }
            if (!found) P[j] = 0; 
        }

        
        System.out.println("Вектор добуткiв по стовпцях:");
        for (int j = 0; j < m; j++) {
            System.out.print(P[j] + "\t");
        }
    }
}
