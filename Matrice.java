public class Matrice {
    static void display(int[]... u) {
        for (int[] k : u) {
            for (int v : k)
                System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void main(String[] arg) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {12, 23, 24, 25}};
        display(mat);
    }
}
