public class Main {
    public static void main(String[] args) {
// Task 1
        System.out.println("Task 1");
        int depositDream=2_459_000;
        int term=0;
        int salary=15_000;
        int deposit=0;
        while (deposit<=depositDream){
            deposit=deposit+salary;
            term++;
            System.out.println("Месяц "+term+", сумма накоплений равна "+deposit);
        }
// Task 2
        System.out.println("Task 2");
        byte i=0;
        while (i<10){
            i++;
            System.out.printf(i+" ");
        }
        System.out.println();
        for (i=10;i>0;i--){
            System.out.printf(i+" ");}
        System.out.println();
// Task 3
        System.out.println("Task 3");
        byte dead=8;
        byte birth=17;
        int number=1000;
        int population=12_000_000;
        byte yearQuantity=10;
        int deadNumber=population/number*dead;
        int birthNumber=population/number*birth;
        for (i=1;i<=yearQuantity;i++){
            population=population+birthNumber-deadNumber;
            System.out.println("Год "+i+"-й, численность населения составляет "+population);
        }
        // Task 4
        System.out.println("Task 4");
        int sumIn=15_000;
        byte percent=7;
        term=0;
        depositDream=12_000_000;
        deposit=sumIn;
        while (deposit<=depositDream){
            term++;
            deposit=deposit+deposit/100*percent;
            System.out.println(term+"-й месяц, сумма накоплений "+deposit);
        }
// Task 5
        System.out.println("Task 5");
        term=0;
        depositDream=12_000_000;
        deposit=sumIn;
        while (deposit<=depositDream) {
            term++;
            deposit = deposit + deposit / 100 * percent;
            if (term % 6 == 0) {
                System.out.println(term + "-й месяц, сумма накоплений " + deposit);
            }
        }
// Task 6
        System.out.println("Task 6");
        term=9;
        deposit=sumIn;
        int monthQuantity=12*term;
        for (i=1;i<=monthQuantity;i++){
            deposit=deposit + deposit / 100 * percent;
            if (i % 6 == 0) {
                System.out.println(i + "-й месяц, сумма накоплений " + deposit);}
        }




// Task 7
        System.out.println("Task 7");
        int friday=5;
        byte monthDays=31;
        for(int y=friday;y<=monthDays;y+=7){
            System.out.println("Сегодня пятница, "+y+"-е число. Необходимо подготовить отчет.");}
// Task 8
        System.out.println("Task 8");
        int year=2024;
        int previousYear=200;
        int nextYear=100;
        for (int j=0;j<=year+nextYear;j+=79) {
            if(j>=year-previousYear) {
                System.out.println(j);}
        }



    }
}