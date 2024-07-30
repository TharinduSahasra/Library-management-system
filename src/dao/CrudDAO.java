package dao;

import Entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.processing.SupportedAnnotationTypes;

public interface CrudDAO <T extends SuperEntity,ID extends Serializable> extends SuperDAO{

    List<T> findAll() throws Exception;

    T find(ID key) throws Exception;

    boolean save(T entity) throws Exception;

    boolean update(T entity) throws Exception;

    boolean delete(ID key) throws Exception;

}
