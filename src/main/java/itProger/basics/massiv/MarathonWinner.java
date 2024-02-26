package itProger.basics.massiv;
/*
Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже. Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.

String[][] names = {
	{"Elena", "341"},
	{"Thomas", "273"},
	{"Hamilton", "294"},
	{"Suzie", "402"},
	{"Phil", "401"},
	{"Matt", "388"}
};
 */
public class MarathonWinner {
    public static void main(String[] args) {
        String[][] names = {
                {"Elena", "341"},
                {"Thomas", "273"},
                {"Hamilton", "294"},
                {"Suzie", "402"},
                {"Phil", "401"},
                {"Matt", "388"}
        };
        int minScore = Integer.parseInt(names[0][1]);
        int minIndex = 0;
        for(int i = 1; i<names.length;i++){
            if(Integer.parseInt(names[i][1])<minScore){
                minIndex=i;
            }
        }
        System.out.println("Быстрее всех пробежал(а) дистанцию " + names[minIndex][0] + " со счетом " + names[minIndex][1]);
    }
}
