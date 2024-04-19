package itProger.basics.HashSet.equalsAndHashCode;

import java.util.Objects;

public class Contact {
    int id;
    String name;
    String phone;

    public Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //проверка на равенство ссылок
        if (this == o) return true;
        //Если сюда попал объект другого типа или пустой объект
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
        /*
        При вычислении hashCode используется формула
        result = 31 * result + (element == null ? 0 : element.hashCode());
        result = 31 * result + (HashCode каждого из данных, находящийся внутри объекта)
        31? 31-это простое число, так получается, что если вычислять сумму и умножать ее на простое число,
        то удается достичь более равномерного разброса значения по диапазону всех возможных значений
        Это важно, т.к хэшкод используется в хэш таблицах важно чтоб объекты как можно более равномерно
        попадали в разные корзины для того, чтобы эффективность хэш таблицы была максимальной.
//         */
    }
}
