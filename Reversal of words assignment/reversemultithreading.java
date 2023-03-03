import java.util.Scanner;  // Import the Scanner class

public class reversestring extends Thread {
    private String sentence;

    public reversestring(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public void run() {
        String[] words = sentence.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        sentence = sb.toString().trim();
    }

    public String getSentence() {
        return sentence;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();   
        reversestring thread = new reversestring(str);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String reversedSentence = thread.getSentence();
        System.out.println(reversedSentence);
    }
}