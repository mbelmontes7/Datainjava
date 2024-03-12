package Dataexample;

public class text {
    public static void main(String[] args) {
        // Our LEGO blocks for the word "CAT"
        char[] catBlocks = {'C', 'A', 'T'};
        // Connecting our LEGO blocks to make the word "CAT"
        String catWord = new String(catBlocks);
        
        // Our LEGO blocks for the word "DOG"
        char[] dogBlocks = {'D', 'O', 'G'};
        // Connecting our LEGO blocks to make the word "DOG"
        String dogWord = new String(dogBlocks);
        
        // Now let's put our words together to make a tiny story
        String story = catWord + " and " + dogWord;
        
        // Showing our story to the world
        System.out.println(story);
    }
}