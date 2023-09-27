package bigO;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Challenges {

    // Define the BigO notation for the firstChallenge method
    private void anotherMethod(){
        System.out.println("other method call");
    }
    public Integer firstChallenge(List<String> input) {
        int a = 10; // O(1)
        a = a + 50 + 30; // O(1)

        for(int i = 0; i < input.size(); i++) { // O(n)
            anotherMethod(); // O(n)
            a++; // O(n)
        }
        return a; // O(1)
    }
    //BIG O(3 + 3n) --simplifying--> O(n)


    // Define the BigO notation for the secondChallenge method
    public Integer secondChallenge(List<Integer> input) {
        int a = 5; // O(1)
        int b = 10; // O(1)
        int c = 50; // O(1)
        for(int i = 0; i < input.size(); i++) {
            int x = i + 1; // O(n)
            int y = i + 2; // O(n)
            int z = i + 3; // O(n)
        }
        for(int i = 0; i < input.size(); i++) {
            int p = i + 2; // O(n)
            int q = i * 2; // O(n)
        }
        return a; // O(1)
    }
    //BIG O(4 + 5n)


    // Make a simple program that return the oldest tweet and the newest tweet from a profile
    // Find first and find last,comparing the dates of each { O(n^2) }
    Tweet first = new Tweet("Hello", LocalDate.now().minusMonths(3));
    Tweet second = new Tweet("World!",LocalDate.now().minusMonths(2));
    Tweet third =  new Tweet("I'm", LocalDate.now().minusMonths(1));
    Tweet fourth = new Tweet("Luppi", LocalDate.now());
    List<Tweet> tweets = Arrays.asList(first, second, third, fourth);
    public class Tweet {
        public String tweet;
        public LocalDate date;
        public Tweet(String content, LocalDate date) {
            this.tweet = content;
            this.date = date;
        }
    }
}


