public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] newarr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            newarr[index] = arr[i];
            index += 1;
        }
        return newarr;
    }

        // Finds the second largest number in an array
        public static int secondLargest ( int[] arr){
            int highest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;
            for (int i = 0; i <= arr.length-1; i++) {
                if (arr[i] > highest) {
                    secondHighest = highest;
                    highest = arr[i];
                } else if (arr[i] > secondHighest)
                    secondHighest = arr[i];
            }
            return secondHighest;
        }




    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the", "of", "and", "a", "to", "in", "is", "you", "that", "it", "he", "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be", "this", "have", "from", "or", "one", "had", "by", "word", "but", "not", "what", "all", "were", "we", "when", "your", "can", "said", "there", "use", "an", "each", "which", "she", "do", "how", "their", "if", "will", "up", "other", "about", "out", "many", "then", "them", "these", "so", "some", "her", "would", "make", "like", "him", "into", "time", "has", "look", "two", "more", "write", "go", "see", "number", "no", "way", "could", "people", "my", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come", "made", "may", "cat", "dog", "cats", "dogs"};
        for (int i = 0; i < dictionary.length; i++) {
            if (word.equals(dictionary[i])) {
                                return true;
}

        }
        return false;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
