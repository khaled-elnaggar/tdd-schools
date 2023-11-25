package org.arithmetic.model;

public interface IRepository {
  void upsert(int id, int val);
  int findById(int id);
}
