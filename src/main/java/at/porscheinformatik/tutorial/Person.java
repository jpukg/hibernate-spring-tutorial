package at.porscheinformatik.tutorial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.core.style.ToStringCreator;

@Entity
public class Person
{
    @Id
    @GeneratedValue
    public Integer id;

    public String firstName;

    public String lastName;

    public Person(String firstName, String lastName)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return new ToStringCreator(this)
            .append("id", id)
            .append("firstName", firstName)
            .append("lastName", lastName)
            .toString();
    }
}
