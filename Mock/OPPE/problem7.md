Write a Java program that processes responses received from an external API. Each response contains a status code and the number of times that status code was received, and the program computes the total count for each status code from a given list of API responses. Complete the program as specified below.

Class ApiResponse has the following members:

Private instance variables: int statusCode and int count
A constructor to initialize the instance variables
Method getStatusCode that returns the status code
Method getCount that returns the count
Class ResponseProcessor has/should have the following members:

Define method aggregateStatusCounts that takes a List<ApiResponse> and returns a Map<Integer, Integer> where the key is the status code and the value is the total count.
main method that does the following:
Accepts input to instantiate 5 ApiResponse objects. The input is accepted in the order – status code, count.
Adds the responses to a List<ApiResponse> object
Invokes method aggregateStatusCounts
Prints each status code along with its total count
What you have to do
Define method aggregateStatusCounts in class ResponseProcessor.
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api/

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

```java
import java.util.*;

class ApiResponse {
    private int statusCode;
    private int count;

    public ApiResponse(int sC, int c) {
        statusCode = sC;
        count = c;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public int getCount() {
        return count;
    }
}

public class ResponseProcessor {







public static Map<Integer, Integer> aggregateStatusCounts(List<ApiResponse> responses) {

    Map<Integer, Integer> statusMap = new LinkedHashMap<>();

    for (ApiResponse r : responses) {
        int code = r.getStatusCode();
        int cnt = r.getCount();
        statusMap.put(code, statusMap.getOrDefault(code, 0) + cnt);
    }

    return statusMap;
}





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ApiResponse> responseList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int code = sc.nextInt();
            int cnt = sc.nextInt();
            responseList.add(new ApiResponse(code, cnt));
        }

        Map<Integer, Integer> result =
                aggregateStatusCounts(responseList);

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() +
                               " -> " + entry.getValue());
        }
        sc.close();
    }
}

```