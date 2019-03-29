package graduation.spring.erent.sys.base;

import java.util.List;

public interface BaseDao<T> {
    void insert(T t);
    void update(T t);
    void delete(T t);
    void delete(int id);
    T find(T t);
    List<T> findList(T t);
    List<T> findAll();
    T findById(int id);

}
