package sk.tomas.app.iam.model.input;

import sk.tomas.app.iam.model.enums.ExcercisesEnum;

/**
 * Created by tomas on 5.3.2017.
 */
public class ExcerciseInput {

    private ExcercisesEnum name;
    private int level;
    private int series;
    private int repetations;

    public ExcerciseInput() {
    }

    public ExcerciseInput(ExcercisesEnum name, int level, int series, int repetations) {
        this.name = name;
        this.level = level;
        this.series = series;
        this.repetations = repetations;
    }

    public ExcercisesEnum getName() {
        return name;
    }

    public void setName(ExcercisesEnum name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepetations() {
        return repetations;
    }

    public void setRepetations(int repetations) {
        this.repetations = repetations;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExcerciseInput that = (ExcerciseInput) o;

        if (level != that.level) return false;
        if (series != that.series) return false;
        if (repetations != that.repetations) return false;
        return name == that.name;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + level;
        result = 31 * result + series;
        result = 31 * result + repetations;
        return result;
    }

    @Override
    public String toString() {
        return "ExcerciseInput{" +
                "name=" + name +
                ", level=" + level +
                ", series=" + series +
                ", repetations=" + repetations +
                '}';
    }
}
