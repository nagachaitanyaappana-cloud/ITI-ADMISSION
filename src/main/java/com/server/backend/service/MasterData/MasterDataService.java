package com.server.backend.service.MasterData;

import java.util.List;

import com.server.backend.DTO.MasterData.DashBoardDataResponse;
import com.server.backend.DTO.MasterData.ItiDetailResponse;
import com.server.backend.DTO.MasterData.ItiPercentStatsResponse;

public interface MasterDataService {

    DashBoardDataResponse getDashBoardData(String year, Integer phase);

    ItiPercentStatsResponse getAbove20PercentItisStats(String year, Integer phase);

    ItiPercentStatsResponse getBelow20PercentItisStats(String year, Integer phase);

    List<ItiDetailResponse> getAbove20PercentItis(String year, Integer phase);

    List<ItiDetailResponse> getBelow20PercentItis(String year, Integer phase);
}
