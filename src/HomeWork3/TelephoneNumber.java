package HomeWork3;

import java.util.*;

public class TelephoneNumber {

    public static void main(String[] args) {


        List<String> name = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        name.addAll(Arrays.asList("Борисов", "Антонов", "Антонов", "Петров", "Николаев", "Иванов"));
        number.add(888777555);
        number.add(888777111);
        number.add(888777000);
        number.add(888777333);
        number.add(888777444);
        number.add(888777999);
        getInfo("Антонов", name, number);

    }

    /**
     * Метод получения информации о людях
     *
     * @param name    - Имя человека, информацию о котором хотите получить
     * @param arrName - лист, содержащий список людей, обязательно в упорядоченном виде
     * @param arrNum  - лист, содержащий список номеров, обязательно в упорядоченном виде
     */
    public static void getInfo(String name, List<String> arrName, List<Integer> arrNum) {
        for (int i = 0; i < arrName.size(); i++)
            if (arrName.get(i).equals(name)) {
                System.out.println(arrName.get(i) + " " + arrNum.get(i));
            }

    }
    /**
     * Метод для добавления информации о людях (Имя - номер)
     * @param name - имя типа String
     * @param phoneNum - номер типа int
     * */
    public static void setInfo(String name, int phoneNum, List<String>arrName, List<Integer>arrNum){
        arrName.add(name);
        arrNum.add(phoneNum);
    }

}


