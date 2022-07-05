package com.kt5.ridefront;

import java.io.Serializable;
import java.time.LocalDate;

public class MissionBoard implements Serializable {
    private Long mainno;
    private String missionTitle;
    private String missionLocation;
    private Long missionPeople;
    private LocalDate missionStartDay;
    private LocalDate missionEndDay;
    private Long joinCoin;
    private String missionLeader;
    private String missionState;

    @Override
    public String toString() {
        return "MissionBoard{" +
                "mainno=" + mainno +
                ", missionTitle='" + missionTitle + '\'' +
                ", missionLocation='" + missionLocation + '\'' +
                ", missionPeople=" + missionPeople +
                ", missionStartDay=" + missionStartDay +
                ", missionEndDay=" + missionEndDay +
                ", joinCoin=" + joinCoin +
                ", missionLeader='" + missionLeader + '\'' +
                ", missionState='" + missionState + '\'' +
                '}';
    }

    public Long getMainno() {
        return mainno;
    }

    public void setMainno(Long mainno) {
        this.mainno = mainno;
    }

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

    public LocalDate getMissionStartDay() {
        return missionStartDay;
    }

    public void setMissionStartDay(LocalDate missionStartDay) {
        this.missionStartDay = missionStartDay;
    }

    public LocalDate getMissionEndDay() {
        return missionEndDay;
    }

    public void setMissionEndDay(LocalDate missionEndDay) {
        this.missionEndDay = missionEndDay;
    }

    public Long getJoinCoin() {
        return joinCoin;
    }

    public void setJoinCoin(Long joinCoin) {
        this.joinCoin = joinCoin;
    }

    public String getMissionLeader() {
        return missionLeader;
    }

    public void setMissionLeader(String missionLeader) {
        this.missionLeader = missionLeader;
    }

    public String getMissionState() {
        return missionState;
    }

    public void setMissionState(String missionState) {
        this.missionState = missionState;
    }
}