package backend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public abstract class MainBase {

    private ArrayList<TMC> records;
    private String filename;

    public MainBase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
    }

    public abstract TMC createRecordFrom(String s);

    public void readFromFile() {
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File not found. A new file has been created: " + filename);
            } catch (IOException e) {
                System.out.println("Error creating new file: " + e.getMessage());
                return;
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                TMC c = createRecordFrom(line);
                records.add(c);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public ArrayList<TMC> returnAllRecords() {
        return records;
    }

    public boolean contains(String key) {
        for (TMC c : records) {
            if (c.getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public TMC getRecord(String key) {
        for (TMC c : records) {
            if (c.getSearchKey().equals(key)) {
                return c;
            }
        }
        return null;
    }

    public void insertRecord(TMC record) {
        if (!contains(record.getSearchKey())) {
            records.add(record);
        } else {
            System.out.println("not contains");
        }

    }

    public boolean deleteRecord(String key) {
        for (TMC c : records) {
            if (c.getSearchKey().equals(key)) {
                records.remove(c);
                return true;
            }
        }
        return false;
    }

    public void saveToFile() {
        try {
            File f = new File(filename);
            PrintWriter pw = new PrintWriter(f);
            for (TMC c : records) {
                pw.println(c.lineRepresentation());
            }
            pw.close();

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
