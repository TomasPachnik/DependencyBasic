package sk.tomas.app.iam.model.output;

import java.util.List;

/**
 * Created by tomas on 5.3.2017.
 */
public class ExcercisePaginationWithCount {

    private long count;
    private List<ExcerciseOutput> excerciseOutputs;

    public ExcercisePaginationWithCount() {
    }

    public ExcercisePaginationWithCount(long count, List<ExcerciseOutput> excerciseOutputs) {
        this.count = count;
        this.excerciseOutputs = excerciseOutputs;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<ExcerciseOutput> getExcerciseOutputs() {
        return excerciseOutputs;
    }

    public void setExcerciseOutputs(List<ExcerciseOutput> excerciseOutputs) {
        this.excerciseOutputs = excerciseOutputs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExcercisePaginationWithCount that = (ExcercisePaginationWithCount) o;

        if (count != that.count) return false;
        return excerciseOutputs != null ? excerciseOutputs.equals(that.excerciseOutputs) : that.excerciseOutputs == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (count ^ (count >>> 32));
        result = 31 * result + (excerciseOutputs != null ? excerciseOutputs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExcercisePaginationWithCount{" +
                "count=" + count +
                ", excerciseOutputs=" + excerciseOutputs +
                '}';
    }
}
