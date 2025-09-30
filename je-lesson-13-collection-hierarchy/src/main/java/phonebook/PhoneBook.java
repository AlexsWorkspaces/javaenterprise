package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Record> records = new ArrayList<>();

    public void add(Record record) {
        this.records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> recordsWithOneName = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                recordsWithOneName.add(record);
            }
        }
        return recordsWithOneName;
    }
}
