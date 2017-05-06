package com.theo.services;

import java.util.List;

public interface IPrueba<T> {

    public boolean create(T t);

    public boolean update(T t);

    public boolean delete(T t);

    public List<T> findByQuery(String q);

    public T findSingle(String q);
}
