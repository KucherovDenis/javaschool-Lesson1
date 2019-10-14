package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {
    public String color;
    private int roundsLeft;

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    private Double power;

    private static long nextSerial = 0;

    private final long serial;

    public long getSerial() {
        return serial;
    }

    public void reload(int countShell) {
        roundsLeft += countShell;
    }

    public void pewPew() {
        roundsLeft -= 2;
    }

    public LethalWeapon() {
        serial = nextSerial;
        nextSerial++;
    }

    public LethalWeapon(String color,Double power, int roundsLeft) {
        this();
        this.color = color;
        this.roundsLeft = roundsLeft;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LethalWeapon that = (LethalWeapon) o;
        return roundsLeft == that.roundsLeft &&
                color.equals(that.color) &&
                power.equals(that.power);
    }

    @Override
    public int hashCode() {
        return color.hashCode() + Objects.hash(roundsLeft, power);
    }
}
