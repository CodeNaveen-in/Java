Employee Portal Request Category Aggregation
An employee portal records the number of requests raised by employees in different request categories (such as Leave, Payroll, and IT Support). Given a list of request records, write a Java program to compute the total number of requests for each category. Complete the program as specified below.

Class RequestRecord has the following members:

Private instance variables: String category and int count
A constructor to initialize the instance variables
Method getCategory that returns the request category
Method getCount that returns the request count
Class EmployeePortal has/should have the following members:

Define method aggregateRequestsByCategory that takes a List<RequestRecord> and returns a Map<String, Integer> with category names as keys and total request counts as values.
main method that does the following:
Accepts input to instantiate 5 RequestRecord objects. The input is accepted in the order – category, count.
Adds the records to a List<RequestRecord> object
Invokes method aggregateRequestsByCategory
Prints each category along with the total number of requests
What you have to do
Define method aggregateRequestsByCategory in class EmployeePortal.
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api/

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

```java
import java.util.*;

class RequestRecord {
    private String category;
    private int count;

    public RequestRecord(String c, int cnt) {
        category = c;
        count = cnt;
    }

    public String getCategory() {
        return category;
    }

    public int getCount() {
        return count;
    }
}

public class EmployeePortal {







public static Map<String, Integer> aggregateRequestsByCategory(List<RequestRecord> records) {

    Map<String, Integer> categoryMap = new LinkedHashMap<>();

    for (RequestRecord r : records) {
        String cat = r.getCategory();
        int cnt = r.getCount();
        categoryMap.put(cat, categoryMap.getOrDefault(cat, 0) + cnt);
    }

    return categoryMap;
}





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<RequestRecord> requestList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String category = sc.next();
            int count = sc.nextInt();
            requestList.add(new RequestRecord(category, count));
        }

        Map<String, Integer> result =
                aggregateRequestsByCategory(requestList);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() +
                               " -> " + entry.getValue());
        }
        sc.close();
    }
}


```