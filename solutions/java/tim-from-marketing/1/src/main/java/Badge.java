class Badge {
    public String print(Integer id, String name, String department) {
        if (department == null) {
            department = "OWNER";
        }
        if (id != null) {
            return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
        }
        else {
            return String.format("%s - %s", name, department.toUpperCase());
        }
    }
}
