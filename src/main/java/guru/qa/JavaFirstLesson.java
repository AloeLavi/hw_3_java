package guru.qa;
import java.util.Scanner;


public class JavaFirstLesson {

    public static void main(String[] args)
    {
        //  1) поупражняться с математическими и логическими операторами,
        System.out.println("Задание 1: поупражняться с математическими и логическими операторами");
        Scanner in = new Scanner(System.in);
        System.out.print("how much does your cat weigh? Enter kg : ");
        int catWeight = in.nextInt();

        if (catWeight > 0
                && catWeight < 2) {
            System.out.println(catWeight+"? Awww your cat is a newborn cutie!");
        } else if (catWeight >= 2  && catWeight < 5) {
            System.out.println(catWeight+"? It has great potential to take over the world, but it's still too small");
        } else  if (catWeight >= 5) {
            System.out.println(catWeight+"? I'm not going to say that your cat is fat. It's just very fluffy");
        }
          else {
            System.out.println("Information is classified? OK, I understand");
        }

        //     добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        System.out.println("Задание 2: добиться переполнения при вычислениях, посмотреть результаты");
        byte varByte = 0;
        varByte+=1000;
        System.out.println(varByte);

        // 2) попробовать вычисления комбинаций типов данных (int и double)
        System.out.println("Задание 3: попробовать вычисления комбинаций типов данных");

        double varDouble = 100.78;
        int varInt = 100;
        System.out.println(varInt+varDouble);
    }

}
