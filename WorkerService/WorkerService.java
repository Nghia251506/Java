package WorkerService;

import WorkerServiceInterface.WorkerServiceInterface;
import comunityuni.com.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkerService implements WorkerServiceInterface {
    @Override
    public List<Worker> insert(Scanner scanner) {
        List<Worker> workers = new ArrayList<>();
        System.out.print("Nhap vao so luong Worker: ");
        int total = scanner.nextInt();
        scanner.nextLine();
        for(int index = 0; index < total; index++){
            Worker worker = new Worker();
            worker.input(scanner, index);
            workers.add(worker);
        }
        return workers;
    }

    @Override
    public List<Worker> insert(Scanner scanner, int status) {
        return null;
    }

    @Override
    public void insert(Scanner scanner, int status, String action) {

    }

    @Override
    public void show(List<Worker> workers) {
        workers.forEach(Worker::output);
    }

    @Override
    public void delete(List<Worker> workers, Scanner scanner) {
        System.out.print("Nhap vao Id worker can xoa: ");
        String Id = scanner.nextLine();
        Worker worker = workers.stream()
                .filter(worker1 -> worker1.getID().equals(Id))
                .findFirst().orElse(null);
        if(worker == null){
            System.out.print("Khong co worker nao co id = " + Id + " !");
            return;
        }
        workers.remove(worker);
        System.out.print("DELETE SUCCESSFULLY!!!");
        this.show(workers);
    }
}
