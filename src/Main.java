public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес бойцов =" + (boxer2Weight + boxer1Weight)+("кг"));
        System.out.println("Разнциа в весе =" + (boxer2Weight - boxer1Weight)+("кг"));

        System.out.println("Задание 7");
        System.out.println("Разнциа в весе =" + (boxer2Weight - boxer1Weight)+("кг"));
        System.out.println("Разнциа в весе =" + (boxer2Weight % boxer1Weight)+("кг"));

        System.out.println("Задание 8.1");
        var workHours = 640;
        var employeeWorks = 8;
        var totalEmployee = workHours/employeeWorks;
        System.out.println("Всего работников в компании " + totalEmployee);
        System.out.println("Задание 8.2");
        totalEmployee = totalEmployee + 94;
        workHours = totalEmployee * employeeWorks;
        System.out.println("Если в компании работает "+ totalEmployee + (" человек, то всего ") + workHours + (" часов работы может быть поделено между сотрудниками"));
    }
}