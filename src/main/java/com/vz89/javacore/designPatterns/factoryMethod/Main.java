package main.java.com.vz89.javacore.designPatterns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("html");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equals("java")) return new JavaDeveloperFactory();
        else if (speciality.equals("html")) return new HTMLDeveloperFactory();
        else throw  new RuntimeException(speciality + " has no factory");
    }
}
