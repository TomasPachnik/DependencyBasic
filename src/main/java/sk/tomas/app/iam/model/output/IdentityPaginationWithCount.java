package sk.tomas.app.iam.model.output;

import java.util.List;

/**
 * Created by Tomas Pachnik on 16-Jan-17.
 */
public class IdentityPaginationWithCount {

    private long count;
    private List<IdentityOutput> identityOutputs;

    public IdentityPaginationWithCount() {
    }

    public IdentityPaginationWithCount(long count, List<IdentityOutput> identityOutputs) {
        this.count = count;
        this.identityOutputs = identityOutputs;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<IdentityOutput> getIdentityOutputs() {
        return identityOutputs;
    }

    public void setIdentityOutputs(List<IdentityOutput> identityOutputs) {
        this.identityOutputs = identityOutputs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentityPaginationWithCount that = (IdentityPaginationWithCount) o;

        if (count != that.count) return false;
        return identityOutputs != null ? identityOutputs.equals(that.identityOutputs) : that.identityOutputs == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (count ^ (count >>> 32));
        result = 31 * result + (identityOutputs != null ? identityOutputs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "IdentityPaginationWithCount{" +
                "count=" + count +
                ", identityOutputs=" + identityOutputs +
                '}';
    }
}
