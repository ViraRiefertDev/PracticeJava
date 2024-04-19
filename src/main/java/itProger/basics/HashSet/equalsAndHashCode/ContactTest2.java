package itProger.basics.HashSet.equalsAndHashCode;

import java.util.ArrayList;

public class ContactTest2 {
    public static void main(String[] args) {
        Contact contact = new Contact(124, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(124, "Vasiliy", "+380681234136");

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(contact);

        System.out.println(contacts.contains(contact2)); //есть ли в массива contact2

        System.out.println(contacts.indexOf(contact2)); //какой номер в массиве у contact2

        contacts.remove(contact2); //и просим коллекцию удалить из массива contact2
        System.out.println(contacts.size());
        /*
        Без метода .equals() в объекте вернет
        false
        -1
        1
        когда добавим метод .equals() в объект выдаст
        true
        0
        0
        Вывод: коллекции в java внутри себя широко используют метод .equals() своих элементов для того,
        чтобы сравнивать их между собой. И во всех методах, где так или иначе требуется сравнение везде
        используется метод .equals() который мы реализовали.
        И мы можем менять логику работы коллекции давая соответствующую реализацию методу .equals()
         В ArrayList метод hashCode не нужен.
         */
    }
}
