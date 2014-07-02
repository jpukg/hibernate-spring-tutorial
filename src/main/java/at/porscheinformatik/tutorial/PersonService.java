package at.porscheinformatik.tutorial;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService
{
    @Autowired
    private EntityManager em;

    public Person createPerson(String firstName, String lastName)
    {
        Person p = new Person(firstName, lastName);
        em.persist(p);
        return p;
    }
}
