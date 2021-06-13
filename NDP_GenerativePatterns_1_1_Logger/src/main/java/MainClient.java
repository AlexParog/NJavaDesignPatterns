import java.util.*;

public class MainClient {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        logger.log("Запускаем программу");

        logger.log("Введите размер списка:");
        int size = scanner.nextInt();
        logger.log("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        getRandom(list, size, maxValue);
        logger.log("Вот случайный список: " + list);

        logger.log("Введите порог для фильтра:");
        int step = scanner.nextInt();
        Filter filter = new Filter(step);
        logger.log("Запускаем фильтрацию");
        List<Integer> result = filter.filterOut(list);
        Collections.sort(result);
        logger.log("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }

    public static List<Integer> getRandom(List<Integer> list, int size, int maxValue) {
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(maxValue) + 1);
        }
        return list;
    }
}
