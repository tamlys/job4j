package ru.job4j.search;
import java.util.LinkedList;
/**
 * PriorityQueue
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 17.07.19
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        if (tasks.size() == 0) {
            tasks.add(task);
        }
            int index = 0;
            for (Task tk : tasks) {
                if (task.getPriority() < tk.getPriority()) {
                    break;
                } else {
                    index++;
                }
            }
        tasks.add(index, task);
    }
    public Task take() {
        return this.tasks.poll();
    }
}
