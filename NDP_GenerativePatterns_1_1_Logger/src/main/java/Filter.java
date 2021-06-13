import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;
    protected int counter;


    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {

        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (Integer numb : source)
            if (numb > treshold) {
                logger.log("Элемент '" + numb + "' проходит");
                result.add(numb);
            } else {
                logger.log("Элемент '" + numb + "' не проходит");
            }

        logger.log("Прошло фильтр " + (source.size() - result.size()) + " элемента из " + source.size());

        return result;
    }
}
