public class Main {
    public static void main(String[] args) {
        MyTreeSet<Integer> ints = new MyTreeSet<>();
        ints.put(2);
        ints.put(8);
        ints.put(4);
        ints.put(658);
        ints.put(2);
        ints.remove(4);
        ints.remove(658);
        System.out.println(ints.contains(658));

        ints.printTree();
    }
}