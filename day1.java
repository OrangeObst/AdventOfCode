import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day1 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\tobia\\Desktop\\AdventOfCode\\values.txt";
        // Using try-with-resources to automatically close resources
        task1(filePath);
        task2(filePath);
    }


    private static void task1(String path) {
        try (
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            // Read lines from the file
            String line;
            
            List<Integer> numbers = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                boolean isFirstNumber = true;
                String firstNumber = "";
                String lastNumber = "";
                for(int i = 0; i < line.length(); i++) {
                    if(Character.isDigit(line.charAt(i))) {
                        if(isFirstNumber) {
                            firstNumber += line.charAt(i);
                            isFirstNumber = false;
                        } 
                        lastNumber = "";
                        lastNumber += line.charAt(i); 
                    }
                }
                firstNumber += lastNumber;
                numbers.add(Integer.parseInt(firstNumber));
            }
            int sum = 0;
            for(int x : numbers) {
                sum += x;
            }
            System.out.println(sum);
        } catch (IOException e) {
            // Handle exceptions, such as file not found or unable to read
            e.printStackTrace();
        }
    }

    private static void task2(String path) {
        try (
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            // Read lines from the file
            String line;
            
            List<Integer> numbers = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replace("one", "one1one")
                    .replace("two", "two2two")
                    .replace("three", "three3three")
                    .replace("four", "four4four")
                    .replace("five", "five5five")
                    .replace("six", "six6six")
                    .replace("seven", "seven7seven")
                    .replace("eight", "eight8eigth")
                    .replace("nine", "nine9nine");
                System.out.println(line);
                boolean isFirstNumber = true;
                String firstNumber = "";
                String lastNumber = "";
                for(int i = 0; i < line.length(); i++) {
                    if(Character.isDigit(line.charAt(i))) {
                        if(isFirstNumber) {
                            firstNumber += line.charAt(i);
                            isFirstNumber = false;
                        } 
                        lastNumber = "";
                        lastNumber += line.charAt(i); 
                    }
                }
                firstNumber += lastNumber;
                numbers.add(Integer.parseInt(firstNumber));
            }
            int sum = 0;
            for(int x : numbers) {
                sum += x;
            }
            System.out.println(sum);
        } catch (IOException e) {
            // Handle exceptions, such as file not found or unable to read
            e.printStackTrace();
        }
    }
}