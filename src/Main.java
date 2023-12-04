// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.


            System.out.println(" Задача 1 ");

            byte byteValue = 23;
            short shortValue = 200;
            int intValue = 700000;
            long longValue = 300000000L;
            float floatValue = 2.23f;
            double doubleValue = 300000000d;
            System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);
            System.out.println("Значение переменной shortValue с типом byte равно " + shortValue);
            System.out.println("Значение переменной intValue с типом byte равно " + intValue);
            System.out.println("Значение переменной longValue с типом byte равно " + longValue);
            System.out.println("Значение переменной floatValue с типом byte равно " + floatValue);
            System.out.println("Значение переменной doubleValue с типом byte равно " + doubleValue);

        }
        {
            System.out.println("  Задача 2  ");

            float floatValue = 27.12f;
            long longValue = 987678965549L;
            float floatValue2 = 2.786f;
            int intValue = 569;
            short shortValue = -159;
            int intValue2 = 27897;
            byte byteValue2 = 67;

            System.out.println("Значение переменной floatValue с типом float равно " + floatValue);
            System.out.println("Значение переменной longValue с типом long равно " + longValue);
            System.out.println("Значение переменной floatValue2 с типом float равно " + floatValue2);
            System.out.println("Значение переменной intValue с типом int равно " + intValue);
            System.out.println("Значение переменной shortValue с типом short равно " + shortValue);
            System.out.println("Значение переменной intValue2 с типом int равно " + intValue2);
            System.out.println("Значение переменной byteValue2 с типом byte равно " + byteValue2);

        }
        {
            System.out.println("  Задача 3  ");

            byte firstClass = 23;
            byte secondClass = 27;
            byte thirdClass = 30;
            short allPaper = 480;

            System.out.println(" В классе Людмилы Павловны " + firstClass + " ученика," + " в классе Анны Сергеевны " + secondClass + " учеников, а" + " в классе Екатерины Андреевны, " + thirdClass + " учеников .");

            int paperForSchoolboy = allPaper / (firstClass + secondClass + thirdClass);
            System.out.println(" Всего было выделено " + allPaper + " листов бумаги ");
            System.out.println(" На каждого ученика рассчитано " + paperForSchoolboy + " листов бумаги ");

        }
        {
            System.out.println("  Задача 4  ");

            byte bottle = 16;
            byte time = 2;

            int bottleByMinute = bottle / time;

            int time1 = 20;

            System.out.println(" За " + time1 + "  минут машина произвела " + time1 * bottleByMinute + " штук бутылок");
            int time2 = 24 * 60;
            System.out.println(" За " + time2 + "  минут машина произвела " + time2 * bottleByMinute + " штук бутылок");
            int time3 = 3 * time2;
            System.out.println(" За " + time3 + "  минут машина произвела " + time3 * bottleByMinute + " штук бутылок");
            int time4 = time3 * 10;
            System.out.println(" За " + time4 + "  минут машина произвела " + time4 * bottleByMinute + " штук бутылок");

        }
        {
            System.out.println("  Задача 5  ");

            byte allTin = 120;
            byte whiteTin = 2;
            byte brownTin = 4;

            int numberOfClass = allTin / (whiteTin + brownTin);
            int whiteTinNeeded = numberOfClass * whiteTin;
            int brownTinNeeded = numberOfClass * brownTin;

            System.out.println(" Для школы было закупленно " + allTin + " банок краски. " + " В школе " + numberOfClass + " классов" + " , на каждый класс требуется  " + whiteTin + " банки белой краски, и " + brownTin + " банки коричневой краски.");

            System.out.println("В школе, где " + numberOfClass + " классов , нужно " + whiteTinNeeded + " банок белой краски и " + brownTinNeeded + " банок коричневой краски.");

        }
        {
            System.out.println("  Задача 6  ");

            byte bananaWeight = 80;
            byte bananaCount = 5;
            int bananaTotalWeight = bananaWeight * bananaCount;

            byte milkWeight = 105;
            byte milkCount = 2;
            int milkTotalWeight = milkWeight * milkCount;

            byte plombirWeight = 100;
            byte plombirCount = 2;
            int plombirTotalWeight = plombirWeight * plombirCount;

            byte eggWeight = 70;
            byte eggCount = 4;
            int eggTotalWeight = eggWeight * eggCount;

            int totalWeight = bananaTotalWeight + milkTotalWeight + plombirTotalWeight + eggTotalWeight;
            float totalWeightKg = totalWeight / 1000f;

            System.out.println(" Завтрак спортсмена: " + totalWeight + " г. ( " + totalWeightKg + " кг )");

            System.out.println("  Задача 7  ");

            short weight = 7000;
            short grammPerDay = 250;
            short grammPerDay2 = 500;

            int dayCount = weight / grammPerDay;
            int dayCount2 = dayCount / 2;

            System.out.println(" Спортсмен сбросит нужное колличество веса, если  будет худеть на " + grammPerDay + " грамм в день." + " Для этого ему потребуется " + dayCount + " дней.");
            System.out.println(" Спортсмен сбросит нужное колличество веса, если  будет худеть на " + grammPerDay2 + " грамм в день." + " Для этого ему потребуется " + dayCount2 + " дней.");
        }
        {

            System.out.println("  Задача 8  ");

            int mashaSalary = 67_760;
            int denisSalary = 83_690;
            int krisSalary = 76_230;

            float bet = 1.1f;

            float riseMashaSalary = mashaSalary * bet;
            float riseDenisSalary = denisSalary * bet;
            float riseKrisSalary = krisSalary * bet;

            float mashaNewSalary = riseMashaSalary * 12 - mashaSalary * 12;
            float denisNewSalary = riseDenisSalary * 12 - denisSalary * 12;
            float krisNewSalary = riseKrisSalary * 12 - krisSalary * 12;

            System.out.println("Маша теперь получает " + riseMashaSalary + " рублей, годовой доход Маши вырос на " + mashaNewSalary + " рублей");
            System.out.println("Денис теперь получает " + riseDenisSalary + " рублей, годовой доход Дениса вырос на " + denisNewSalary + " рублей");
            System.out.println("Кристина теперь получает " + riseKrisSalary + " рублей, годовой доход Кристина вырос на " + krisNewSalary + " рублей");

        }
    }
}