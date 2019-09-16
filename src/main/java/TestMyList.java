public class TestMyList {

    public static void main(String[] args) {
        MyList<Object> myList=new MyList<>(3);
        myList.add(1);
        myList.add("ab");
        myList.add(3);
        myList.add(4);
        myList.add(5);

//        System.out.println(myList.remove(6));
        myList.remove(5);
        System.out.println(myList.contains("ab"));
        System.out.println(myList.indexOf(4));
        System.out.println(myList.indexOf("abc"));
        System.out.println(myList.getSize());
        myList.clear();
        System.out.println(myList.getSize());



        try {


        }catch (IndexOutOfBoundsException e){
            System.out.println("Element out of array");
        }

    }
}
