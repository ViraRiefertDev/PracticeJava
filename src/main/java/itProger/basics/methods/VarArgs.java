package itProger.basics.methods;
    /*
      Varargs позволяют подавать в метод вариативное количество аргументов одного типа
      и под капотом Java создает под это дело массив и заносит аргументы в него на поверхности
      это выглядит как ... меожду типом рагумента и именем параметра
      */
public class VarArgs {

        public static void main(String[] args) {
         add(1,2,3);
         add(1,2,3,4);
         add(1,2,3,4,5);
         add(1,2,3,4,5,6);
        }

    /*
    Надо стоздать метод add который должен вывести на экран сложение значения аргументов
    (их может быть любое количество) вместе с суммой через =
     */
    public static void add(int ... values) {
        int sum = 0;
        String addition ="";
        for(int i: values){
            sum += i;
            System.out.print(addition + i);
            addition = "+";
        }
        System.out.println("=" + sum);
    }

}

