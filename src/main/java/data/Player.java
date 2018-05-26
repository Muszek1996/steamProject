package data;

import java.util.Objects;

public class Player {
    int steamid;
    double value;
    boolean isVacBanned;
    String realName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return steamid == player.steamid &&
                Double.compare(player.value, value) == 0 &&
                isVacBanned == player.isVacBanned &&
                Objects.equals(realName, player.realName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(steamid, value, isVacBanned, realName);
    }

    public int getSteamid() {
        return steamid;
    }

    public void setSteamid(int steamid) {
        this.steamid = steamid;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isVacBanned() {
        return isVacBanned;
    }

    public void setVacBanned(boolean vacBanned) {
        isVacBanned = vacBanned;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
