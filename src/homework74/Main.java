package homework74;

public class Main{

    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(2);
        myArrayList.addLast("1");
        myArrayList.addLast("2");
        myArrayList.addLast("3");
        myArrayList.removeFirst();
        myArrayList.addFirst("newAdd");

    }
}
