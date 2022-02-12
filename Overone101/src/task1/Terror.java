package task1;

import java.util.Objects;

public class Terror {
    public String name;
    public String secondName;

    public Terror(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terror terror = (Terror) o;
        return Objects.equals(name, terror.name) && Objects.equals(secondName, terror.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }

    @Override
    public String toString() {
        return "Terror{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }


}
