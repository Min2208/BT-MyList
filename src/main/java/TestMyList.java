public class TestMyList {

    public static void main(String[] args) {
        MyList<Object> myList=new MyList<>(3);
        myList.add(1);
//        myList.add("ab");
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
        myList.add(2,10000);

        System.out.println(myList.get(2));



        try {


        }catch (IndexOutOfBoundsException e){
            System.out.println("Element out of array");
        }

    }
}
