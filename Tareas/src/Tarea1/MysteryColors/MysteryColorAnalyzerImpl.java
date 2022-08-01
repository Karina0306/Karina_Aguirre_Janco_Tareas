package Tarea1.MysteryColors;
import java.util.ArrayList;
import java.util.List;

/**
 * This class analyze the mystery color.
 *
 * @see MysteryColorAnalyzer
 */
public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        ArrayList listOfDistinctColors = new ArrayList();
        for (int i = 0; i < mysteryColors.size(); i++) {
            Color nameColor = mysteryColors.get(i);
            if (listOfDistinctColors.indexOf(nameColor) == -1) {
                listOfDistinctColors.add(nameColor);
            }
        }
        return listOfDistinctColors.size() ;
    }
    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int counter = 0;
        for (int i = 0; i < mysteryColors.size(); i++) {
            Color nameColor = mysteryColors.get(i);
            if (nameColor.equals(color)) {
                counter++;
            }
        }
        return counter;
    }
}
