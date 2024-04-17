package dev.asjordi.repository;

import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public interface IRepository<T>{
    
    List<T> getAll() throws Exception;
    T getById(Integer id) throws Exception;
    void add(T t) throws Exception;
    void delete(Integer id) throws Exception;

}
