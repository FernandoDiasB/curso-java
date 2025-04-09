public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("Maluque");
        manager.setLogin("maluquinho");
        manager.setPassword("12746213984");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
    }
}
