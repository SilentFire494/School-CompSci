import java.util.stream.StreamSupport;

public class TestPerson 
{
    public static void main(String[] args) 
    {
        Person jaden = new Person("Jaden", 130);
        Person julian = new Person("Julian", 109);

        Food mozzoStick = new Food("Mozzarella Sticks", 160);
        System.out.println(jaden.getName() + ": " + jaden.getWeight());

        int total = 12;
        for (int i = 0; i < total; i++) 
        {
            jaden.eat(mozzoStick);
        }
        System.out.println(jaden.getName() + ": " + jaden.getWeight());

        Exercise running = new Exercise("Running", 12);
        jaden.exercise(running, 10000);
        System.out.println(jaden.getName() + ": " + jaden.getWeight());
    }
}
