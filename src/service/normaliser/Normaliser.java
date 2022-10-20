package service.normaliser;

import service.enums.NormalisedTitle;

import java.util.*;
import java.util.stream.Collectors;

public class Normaliser {


    public String normalise(String title) {
        Map<Double, NormalisedTitle> possibleTitles = new HashMap<>();
        Arrays.stream(NormalisedTitle.values())
                .forEach(normalisedTitle -> possibleTitles.put(getScore(title, normalisedTitle), normalisedTitle));
        Double maxScore = possibleTitles.keySet().stream().mapToDouble(it -> it).max().getAsDouble();
        return possibleTitles.get(maxScore).getTitle();
    }

    private Double getScore(String title, NormalisedTitle normalisedTitle) {
        return getScore(split(title), normalisedTitle.getTitleWords());
    }

    private Double getScore(List<String> titleWords, List<String> normalisedTitleWords) {
        Set<String> matched = new HashSet<>();
        titleWords.stream().filter(normalisedTitleWords::contains).forEach(matched::add);
        return ((double) matched.size())/titleWords.size();
    }

    private List<String> split(String title) {
        return Arrays.asList(title.split(" "));
    }
}
