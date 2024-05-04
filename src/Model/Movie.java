package Model;

import ToolsPackage.Tools;

public class Movie extends Title{
    private String manager;
    private int durationInMinutes;

    @Override
    public void create(String titleType) {
        super.create(titleType);

        Tools.print("Enter " + titleType + " manager");
        setManager(Tools.inputString());

        Tools.print("Enter " + titleType + " duration in minutes");
        setDurationInMinutes(Tools.inputInt());
    }

    @Override
    public String getDataSheet() {
        return super.getDataSheet() +
                "|Manager: " + manager + "|" + "\n" +
                "|Duration in minutes: " + durationInMinutes + "|" + "\n" +
                "|******************|" + "\n";
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
