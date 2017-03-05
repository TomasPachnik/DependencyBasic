package sk.tomas.app.iam.model.output;

import sk.tomas.app.iam.model.enums.ExcercisesEnum;

/**
 * Created by tomas on 5.3.2017.
 */
public class ExcerciseOutput {

    private ExcercisesEnum name;
    private int level;
    private int series;
    private int repetations;
    private Long timestamp;

    public ExcerciseOutput() {
    }

    public ExcerciseOutput(ExcercisesEnum name, int level, int series, int repetations, Long timestamp) {
        this.name = name;
        this.level = level;
        this.series = series;
        this.repetations = repetations;
        this.timestamp = timestamp;
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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExcerciseOutput that = (ExcerciseOutput) o;

        if (level != that.level) return false;
        if (series != that.series) return false;
        if (repetations != that.repetations) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return timestamp != null ? timestamp.equals(that.timestamp) : that.timestamp == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + level;
        result = 31 * result + series;
        result = 31 * result + repetations;
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExcerciseOutput{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", series=" + series +
                ", repetations=" + repetations +
                ", timestamp=" + timestamp +
                '}';
    }
}
