import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        List<Integer> sourceList = new ArrayList<>();
        Random random = new Random();

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int listSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int bound = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        for (int i = 0; i < listSize; i++) {
            sourceList.add(random.nextInt(bound));
        }

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int threshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        List<Integer> resultList = filter.filterOut(sourceList);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список:");
        resultList.forEach(System.out::println);

        logger.log("Завершаем программу");



    }
}
