package Model;

import ToolsPackage.Tools;

public class Title {
    private String name;
    private String summary;
    private double evaluation;
    private boolean includedInTheBasicPlan;
    private int releaseYear;

    public void create(String titleType) {
        Tools.print("Enter " + titleType + " name");
        setName(Tools.inputString());

        Tools.print("Enter " + titleType + " summary");
        setSummary(Tools.inputString());

        Tools.print("Enter " + titleType + " evaluation");
        setEvaluation(Tools.inputDouble());

        Tools.print("Enter " + titleType + " included in the basic plan (y/n)");
        setIncludedInTheBasicPlan(Tools.inputBool("y"));

        Tools.print("Enter " + titleType + " release year");
        setReleaseYear(Tools.inputInt());
    }

    public String getDataSheet() {
        return
                "|____Data sheet____|" + "\n" +
                        "|Name: " + name + "|" + "\n" +
                        "|Release year: " + releaseYear + "|" + "\n" +
                        "|Summary: " + summary + "|" + "\n" +
                        "|Evaluation: " + evaluation + "|" + "\n" +
                        "|Included in the basic plan: " + includedInTheBasicPlan + "|" + "\n" +
                        "|**|" + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }

    public boolean isIncludedInTheBasicPlan() {
        return includedInTheBasicPlan;
    }

    public void setIncludedInTheBasicPlan(boolean includedInTheBasicPlan) {
        this.includedInTheBasicPlan = includedInTheBasicPlan;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
