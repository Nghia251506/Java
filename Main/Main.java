package Main;

import WorkerService.WorkerService;
import WorkerServiceInterface.WorkerServiceInterface;
import comunityuni.com.Worker;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        Scanner scanner = new Scanner(System.in);
        WorkerServiceInterface workerServiceInterface = new WorkerService();
        System.out.print("\t\t\t\t\t---MANAGE WORKER---");
        List<Worker> workers = workerServiceInterface.insert(scanner);
        workerServiceInterface.show(workers);
        workerServiceInterface.delete(workers, scanner);
    }
}
