import java.time.LocalDate;
import static javax.swing.JOptionPane.*;
public class HomeWork {
    public static void main(String[] args){

// первое задание - Написать текст с переносом
        System.out.println("Silence \nis \ngolden");

// второе задание - Посчитать сумму трех чисел
        int a = Integer.parseInt(showInputDialog("Введите число 1"));
        int b = Integer.parseInt(showInputDialog("Введите число 2"));
        int c = Integer.parseInt(showInputDialog("Введите число 3"));
        System.out.println("2 * " + a + "+ (" + b + " - 3) + "+ c +"^2 равно " + (2 * a + (b - 3) + c * c));

// третье задание - Перевести метры в км
        int mt = Integer.parseInt(showInputDialog("Введите расстояние в метрах: "));
        double result = (double) mt/1000;
        System.out.printf(  "%f км", result);

// четвертое задание - Посчитать количество лет до пенсии
        int age = Integer.parseInt(showInputDialog("Введите год вашего рождения: "));
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();
        System.out.printf("\nВам %d лет.",  (current_Year - age));
        if ((65 - current_Year + age) >= 0) {
            System.out.printf("\nДо пенсии осталось %d лет.",  (65 - current_Year + age));
        } else {System.out.println("Вы на пенсиии");}

    }
}
