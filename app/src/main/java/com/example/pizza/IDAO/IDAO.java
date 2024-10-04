package com.example.pizza.IDAO;

import com.example.pizza.Clases.Produit;
import java.util.List;

public interface IDAO <T>{

  public abstract Boolean create(T o);
  public abstract Boolean Delete(T o);

  public abstract Boolean Update(T o);

  public abstract List<T> findAll();

  public abstract T findByID(int is);


}
