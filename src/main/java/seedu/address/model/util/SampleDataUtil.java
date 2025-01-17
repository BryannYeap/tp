package seedu.address.model.util;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.interview.Interview;
import seedu.address.model.notes.Notes;
import seedu.address.model.person.Email;
import seedu.address.model.person.EmploymentType;
import seedu.address.model.person.ExpectedSalary;
import seedu.address.model.person.Experience;
import seedu.address.model.person.LevelOfEducation;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Role;
import seedu.address.model.tag.Tag;


/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Yeoh"), new Phone("87438807"),
                new Email("alex_yeoh@gmail.com"),
                new Role("Software Engineer"),
                new EmploymentType("Full time"),
                new ExpectedSalary("4500"),
                new LevelOfEducation("PhD"),
                new Experience("0"),
                getTagSet("Excellent"),
                Optional.of(new Interview("2021-10-20, 9:30")),
                Optional.of(new Notes("He is a perfect candidate for this job!"))),
            new Person(new Name("Bernice Yu"), new Phone("99272758"),
                new Email("berniceyu99@yahoo.com.sg"),
                new Role("Software Tester"),
                new EmploymentType("Part time"),
                new ExpectedSalary("3300"),
                new LevelOfEducation("Masters"),
                new Experience("1"),
                getTagSet("Remarkable", "Passionate"),
                Optional.empty(),
                Optional.of(new Notes("She is very passionate about this field."))),
            new Person(new Name("Charlotte Oliveiro"), new Phone("93210283"),
                new Email("ch4rl0tt3@hotmail.com"),
                new Role("Receptionist"),
                new EmploymentType("Temporary"),
                new ExpectedSalary("1200"),
                new LevelOfEducation("Elementary"),
                new Experience("2"),
                getTagSet("Average"),
                Optional.of(new Interview("2021-10-20, 11:00")),
                Optional.of(new Notes("Nothing outstanding about this applicant."))),
            new Person(new Name("David Li"), new Phone("91031282"),
                new Email("li.david@u.nus.edu"),
                new Role("Lab Technician"),
                new EmploymentType("Internship"),
                new ExpectedSalary("0"),
                new LevelOfEducation("Bachelors"),
                new Experience("3"),
                getTagSet("Outstanding"),
                Optional.of(new Interview("2022-10-20, 15:00")),
                Optional.of(new Notes("He would not fit the job based off his resume."))),
            new Person(new Name("Irfan Ibrahim"), new Phone("92492021"),
                new Email("irfan-ibrahim@gmail.com.sg"),
                new Role("Cashier"),
                new EmploymentType("Full time"),
                new ExpectedSalary("2200"),
                new LevelOfEducation("Middle School"),
                new Experience("4"),
                getTagSet("Good"),
                Optional.empty(),
                Optional.empty()),
            new Person(new Name("Roy Balakrishnan"), new Phone("92624417"),
                new Email("royb@hotmail.com"),
                new Role("Financial Advisor"),
                new EmploymentType("Part time"),
                new ExpectedSalary("3600"),
                new LevelOfEducation("High School"),
                new Experience("5"),
                getTagSet("Normal"),
                Optional.of(new Interview("2022-01-20, 15:00")),
                Optional.of(new Notes("He has past leadership skills, "
                        + "but do not have proper experience in this field.")))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
