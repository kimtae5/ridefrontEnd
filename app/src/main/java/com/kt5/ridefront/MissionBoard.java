package com.kt5.ridefront;

import java.io.Serializable;
import java.time.LocalDate;

public class MissionBoard implements Serializable {
    private String missionTitle;
    private String missionLocation;
    private Long missionPeople;
    private LocalDate missonStartDay;
    private LocalDate missonEndDay;
    private Long joinCoin;
    private String missonLeader;
    private String missonState;

    public String getMissionTitle() {
        return missionTitle;
    }

    public void setMissionTitle(String missionTitle) {
        this.missionTitle = missionTitle;
    }

    public String getMissionLocation() {
        return missionLocation;
    }

    public void setMissionLocation(String missionLocation) {
        this.missionLocation = missionLocation;
    }

    public Long getMissionPeople() {
        return missionPeople;
    }

    public void setMissionPeople(Long missionPeople) {
        this.missionPeople = missionPeople;
    }

    public LocalDate getMissonStartDay() {
        return missonStartDay;
    }

    public void setMissonStartDay(LocalDate missonStartDay) {
        this.missonStartDay = missonStartDay;
    }

    public LocalDate getMissonEndDay() {
        return missonEndDay;
    }

    public void setMissonEndDay(LocalDate missonEndDay) {
        this.missonEndDay = missonEndDay;
    }

    public Long getJoinCoin() {
        return joinCoin;
    }

    public void setJoinCoin(Long joinCoin) {
        this.joinCoin = joinCoin;
    }

    public String getMissonLeader() {
        return missonLeader;
    }

    public void setMissonLeader(String missonLeader) {
        this.missonLeader = missonLeader;
    }

    public String getMissonState() {
        return missonState;
    }

    public void setMissonState(String missonState) {
        this.missonState = missonState;
    }

    @Override
    public String toString() {
        return "MissionBoard{" +
                "missionTitle='" + missionTitle + '\'' +
                ", missionLocation='" + missionLocation + '\'' +
                ", missionPeople=" + missionPeople +
                ", missonStartDay=" + missonStartDay +
                ", missonEndDay=" + missonEndDay +
                ", joinCoin=" + joinCoin +
                ", missonLeader='" + missonLeader + '\'' +
                ", missonState='" + missonState + '\'' +
                '}';
    }
}