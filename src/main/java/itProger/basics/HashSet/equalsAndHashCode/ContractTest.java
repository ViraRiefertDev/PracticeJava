package itProger.basics.HashSet.equalsAndHashCode;

public class ContractTest {
    public static void main(String[] args) {
        Contact contact = new Contact(124, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(124, "Vasiliy", "+380681234136");
        System.out.println(contact.hashCode());
        System.out.println(contact2.hashCode());

        //та реализация equals, которая нам досталась от object просто проверяется ссылки на равенство
        System.out.println(contact.equals(contact2));//false
    }
}
