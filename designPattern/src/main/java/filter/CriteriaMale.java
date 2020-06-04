package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {

        List<Person> malePeople = new ArrayList<>();

        for (Person person : people) {
            if ("MALE".equalsIgnoreCase(person.getGender())) {
                malePeople.add(person);
            }
        }
        return malePeople;
    }
}
