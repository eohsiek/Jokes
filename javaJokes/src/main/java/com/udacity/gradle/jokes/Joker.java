/* Jokes from https://www.rd.com/jokes/

 */
package com.udacity.gradle.jokes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Joker {
    public String getJoke() {
        Random rand = new Random();
        List<String> jokes = Arrays.asList(
                "What do you call it when you have your mom's mom on speed dial?  Instagram.",
                "Always borrow money from a pessimist.  He won't expect it back",
                "Where do birds go for coffee? To the NESTcafe",
                "What do you call a pile of kittens? A meowntain.",
                "Why was the belt sent to jail? For holding up a pair of pants!",
                "Can Bees fly in the rain? Not without their yellow jackets");

        int randomIndex;
        String randomElement = "";
        for (int i = 0; i < jokes.size(); i++) {
           randomIndex = rand.nextInt(jokes.size());
           randomElement = jokes.get(randomIndex);
        }
        return randomElement;
    }


}
