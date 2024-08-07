package home_work_4;

public class DataContainerMain {
    public static void main(String[] args) {
        int arrayLength = 5;
        DataContainer<String> container = new DataContainer<>(new String[arrayLength]);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1)); //Как дела
        //for (String elem:container){
        //System.out.println(elem);} // ["Работаю", "Как дела", "Давай потом"]

        DataContainer<Integer> container2 = new DataContainer<>(new Integer[arrayLength]);
        int index01 = container2.add(1);
        int index02 = container2.add(2);
        int index03 = container2.add(3);
        int index04 = container2.add(4);
        int num1 = container2.get(index01);
        int num2 = container2.get(index02);
        int num3 = container2.get(index03);
        int num4 = container2.get(index04);
        System.out.println(num1); //1
        System.out.println(num2); //2
        System.out.println(num3); //3
        System.out.println(num4); //4
        container2.delete(num1);
        System.out.println(container2.get(index01)); //1
    }
}
