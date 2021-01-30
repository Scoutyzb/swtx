package com.scout.pois.services;

import com.scout.pois.entity.Poi;
import com.scout.pois.entity.Position;
import com.scout.pois.entity.Value;

public interface ValueService {
    public Value getValue(Position position,int year);

    public Value getValue(Poi center,int year);
    public Value calValue(Value value);
}
