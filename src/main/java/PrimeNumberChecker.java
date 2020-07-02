import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeNumberChecker {

    private Set<Integer> primeNumbers = new HashSet<Integer>();

    public PrimeNumberChecker() throws Exception {
        try (FileReader reader = new FileReader(getClass().getClassLoader().getResource("primeNumbers.txt").getFile());
            BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String n : line.trim().split("\\s+")) {
                    primeNumbers.add(Integer.valueOf(n));
                }

            }
        }
    }

    public boolean isPrime(Integer number) {
        validateInput(number);
        return primeNumbers.contains(number);
    }

    private void validateInput(Integer number) {
        if ((number == null) || (number < 0) || (number > 1000000)) {
            throw new IllegalArgumentException(number + " must be more or equal than 0 and less or equal than 1000000");
        }
    }
}
