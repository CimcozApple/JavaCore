package main.java.com.vz89.javacore.designPatterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First");
        jobSite.addVacancy("Second");

        Observer observer1 = new Subscriber("vova");
        Observer observer2 = new Subscriber("petya");

        jobSite.addObserver(observer1);
        jobSite.addObserver(observer2);

        jobSite.addVacancy("third");
    }
}
