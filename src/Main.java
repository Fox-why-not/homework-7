public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        int total = 0;
        int q = 0;
       while (total < 2459000){
           total += 15000;
           q++;
        }
        System.out.println(q + " месяц" + q + " сумма накоплений равна " + total + " рублей");
        System.out.println();

        System.out.println("task 2");
        int numb = 0;
        while (numb < 10) {
            numb++;
            System.out.println(numb + " ");
        }
        System.out.println();
        for (; numb > 0; numb--){
            System.out.println(numb + " ");
        }
        System.out.println();

        System.out.println("task 3");
        int pop = 12000000;
        int death = 8;
        int birth = 17;
        for (int year = 1; year <= 10; year++) {
            pop = pop + (birth - death) * pop/1000;
            System.out.println("Год " + year + " - численность населения состовляет " + pop );
        }
        System.out.println();
        {
            System.out.println("task 4");
            int sal = 15000;
            int month = 1;
            while (sal < 12000000) {
                sal = sal + (int) (sal * 0.07);
                System.out.println("месяц " + month + ", сумма: " + sal);
                month++;
            }
            System.out.println();
        }
        {
            System.out.println("task 5");
            int sal = 15000;
            int month = 1;
            while (sal < 12000000) {
                sal = sal + (int) (sal * 0.07);
                if (month % 6 == 0) {
                    System.out.println("месяц " + month + ", сумма: " + sal);
                }
                month++;
            }
            System.out.println();
        }
        {
            System.out.println("task 6");
            int sal = 15000;
            var period = 9 * 12;
            for (int month = 1; month < period; month++) {
                sal = sal + (int) (sal * 0.07);
                if (month % 6 == 0) {
                    System.out.println("месяц " + month + ", сумма: " + sal);
                }
            }
            System.out.println();
        }

            {
                System.out.println("task 7");
                for (int day = 2; day < 31; day += 7){
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт");
                }
            }
        System.out.println();

        {
            System.out.println("task 8");
            for (int year = 2024 - 200 ; year < 2024 + 100; year++){
                if (year % 79 == 0){
                    System.out.println(year);
                }
            }
        }
    }
}