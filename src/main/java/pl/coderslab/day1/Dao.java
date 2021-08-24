package pl.coderslab.day1;

import java.util.List;

public interface Dao<E> {

    void delete(int id);

    List<E> getAll();

}
