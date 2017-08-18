package com.bowling.dao.iface;

import java.util.List;

import com.bowling.domain.Output;
import com.bowling.domain.Player;

public interface ICalculateScore {
	public List<Output> getTheScore(String c, int[] player);

}
