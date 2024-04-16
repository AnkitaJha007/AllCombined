package DesignPrincipleAllEvenOdd;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface StrategyForSum {
    int sum(List<Integer> numbers);
}
class All implements StrategyForSum {
    @Override
    public int sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
class Odd implements StrategyForSum {
    @Override
    public int sum(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
    }
}

class Even implements StrategyForSum {
    @Override
    public int sum(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
    }
}

    class Prime implements StrategyForSum {
        @Override
        public int sum(List<Integer> numbers) {
            return numbers.stream().filter(SumWithUserChoice::isPrime).mapToInt(Integer::intValue).sum();
        }
    }
class CalculateSum {
    private StrategyForSum strategy;

    public void setStrategy(StrategyForSum strategy) {
        this.strategy = strategy;
    }
    public int calculate(List<Integer> numbers) {
        return strategy.sum(numbers);
    }
}
public class SumWithUserChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the integers (enter -1 to finish):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            numbers.add(num);
        }

        CalculateSum calculator = new CalculateSum();

        System.out.println("Choose strategy:");
        System.out.println("1. All");
        System.out.println("2. Odd");
        System.out.println("3. Even");
        System.out.println("4. Prime");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculator.setStrategy(new All());
                break;
            case 2:
                calculator.setStrategy(new Odd());
                break;
            case 3:
                calculator.setStrategy(new Even());
                break;
            case 4:
                calculator.setStrategy(new Prime());
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        int sum = calculator.calculate(numbers);
        System.out.println("Total: " + sum);

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
