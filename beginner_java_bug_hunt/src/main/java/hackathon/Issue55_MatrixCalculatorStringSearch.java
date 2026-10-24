public class Issue55_MatrixCalculatorStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A32", "B32", "C32"};
        String target = new String("B32");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
