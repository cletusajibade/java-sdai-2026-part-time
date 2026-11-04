package org.claimacademy.refactor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Deliberately poor code for the Week 13 refactoring lab.
 * Find the SOLID violations, magic numbers, duplication and long methods.
 */
public class TaskService {
    private List<String[]> tasks = new ArrayList<>();

    public void createAndNotify(String title, String desc, String due, String notifyType, String contact) {
        if (title == null || title.length() < 3 || title.length() > 100) {
            System.out.println("bad title");
            return;
        }
        if (desc != null && desc.length() > 500) {
            System.out.println("bad desc");
            return;
        }
        LocalDate d = LocalDate.parse(due);
        if (d.isBefore(LocalDate.now())) {
            System.out.println("bad date");
            return;
        }
        String[] t = new String[]{String.valueOf(tasks.size() + 1), title, desc, due, "false"};
        tasks.add(t);

        if (notifyType.equals("email")) {
            System.out.println("Connecting to SMTP server on port 587...");
            System.out.println("Sending email to " + contact + ": New task " + title);
        } else if (notifyType.equals("sms")) {
            System.out.println("Connecting to SMS gateway...");
            System.out.println("Sending SMS to " + contact + ": New task " + title);
        } else {
            // no notification
        }
    }

    public void complete(int id, String notifyType, String contact) {
        for (String[] t : tasks) {
            if (Integer.parseInt(t[0]) == id) {
                t[4] = "true";
                if (notifyType.equals("email")) {
                    System.out.println("Connecting to SMTP server on port 587...");
                    System.out.println("Sending email to " + contact + ": Completed " + t[1]);
                } else if (notifyType.equals("sms")) {
                    System.out.println("Connecting to SMS gateway...");
                    System.out.println("Sending SMS to " + contact + ": Completed " + t[1]);
                }
            }
        }
    }

    public void printReport() {
        int done = 0;
        for (String[] t : tasks) if (t[4].equals("true")) done++;
        System.out.println("Total: " + tasks.size() + " Done: " + done
                + " Pct: " + (tasks.size() == 0 ? 0 : done * 100 / tasks.size()) + "%");
    }
}
