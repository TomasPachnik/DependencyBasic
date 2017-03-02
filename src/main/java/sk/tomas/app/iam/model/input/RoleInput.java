package sk.tomas.app.iam.model.input;

/**
 * Created by Tomas Pachnik on 12-Jan-17.
 */
public class RoleInput {

    private String name;
    private String description;
    private int level;

    public RoleInput() {
    }

    public RoleInput(String name, String description, int level) {
        this.name = name;
        this.description = description;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleInput roleInput = (RoleInput) o;

        if (level != roleInput.level) return false;
        if (name != null ? !name.equals(roleInput.name) : roleInput.name != null) return false;
        return description != null ? description.equals(roleInput.description) : roleInput.description == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + level;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "RoleInput{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                '}';
    }
}
