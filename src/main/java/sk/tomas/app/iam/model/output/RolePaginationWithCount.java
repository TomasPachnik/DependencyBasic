package sk.tomas.app.iam.model.output;

import java.util.List;

/**
 * Created by Tomas Pachnik on 01-Mar-17.
 */
public class RolePaginationWithCount {

    private long count;
    private List<RoleOutput> roleOutputs;

    public RolePaginationWithCount() {
    }

    public RolePaginationWithCount(long count, List<RoleOutput> roleOutputs) {
        this.count = count;
        this.roleOutputs = roleOutputs;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<RoleOutput> getRoleOutputs() {
        return roleOutputs;
    }

    public void setRoleOutputs(List<RoleOutput> roleOutputs) {
        this.roleOutputs = roleOutputs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolePaginationWithCount that = (RolePaginationWithCount) o;

        if (count != that.count) return false;
        return roleOutputs != null ? roleOutputs.equals(that.roleOutputs) : that.roleOutputs == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (count ^ (count >>> 32));
        result = 31 * result + (roleOutputs != null ? roleOutputs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RolePaginationWithCount{" +
                "count=" + count +
                ", roleOutputs=" + roleOutputs +
                '}';
    }
}
