package hw_09_11_2020.hw_1;

public class Doctor {
    private String name;
    private String position;
    private String department;
    private String experience;

    public Doctor(String name, String position, String department, String experience) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", experience=" + experience +
                '}';
    }
}
