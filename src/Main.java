public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.traverse();
        list.append(new LinkedList.Node("Hello"));
        list.append(new LinkedList.Node("goodbye"));
        list.append(new LinkedList.Node("my"));
        list.append(new LinkedList.Node("frend"));
        list.traverse();
        System.out.println(list.size);
        list.remove(new LinkedList.Node("Hello"));
        list.remove(new LinkedList.Node("goodbye"));
        list.remove(new LinkedList.Node("my"));
        list.remove(new LinkedList.Node("frend"));
        list.traverse();
        System.out.println(list.size);
    }
}
