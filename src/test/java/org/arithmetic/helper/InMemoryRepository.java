package org.arithmetic.helper;

import org.arithmetic.model.IRepository;

import java.util.HashMap;

public class InMemoryRepository implements IRepository {
  private final HashMap<Integer, Integer> map;

  public InMemoryRepository() {
    map = new HashMap<>();
  }

  @Override
  public void upsert(int id, int val) {
    map.put(id, val);
  }

  @Override
  public int findById(int id) {
    return map.get(id);
  }
}
