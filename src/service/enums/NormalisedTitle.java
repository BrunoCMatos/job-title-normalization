package service.enums;

import java.util.Arrays;
import java.util.List;

public enum NormalisedTitle {

    ARCHITECT("Architect"),
    SOFTWARE_ENGINEER("Software engineer"),
    QUANTITY_SURVEYOR("Quantity surveyor"),
    ACCOUNTANT("Accountant");

    private NormalisedTitle(String title) {
        this.title = title;
    }

    private String title;

    public List<String> getTitleWords() {
        return Arrays.asList(title.split(" "));
    }

    public String getTitle() {
        return title;
    }
}
