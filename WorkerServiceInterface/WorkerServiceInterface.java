package WorkerServiceInterface;

import comunityuni.com.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface WorkerServiceInterface {
    List<Worker> insert(Scanner scanner);
    List<Worker> insert(Scanner scanner, int status);
    void insert(Scanner scanner, int status, String action);
    void show(List<Worker> workers);
    void delete(List<Worker> workers, Scanner scanner);
}
