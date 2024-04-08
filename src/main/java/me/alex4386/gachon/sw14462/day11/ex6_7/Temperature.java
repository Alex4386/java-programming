package me.alex4386.gachon.sw14462.day11.ex6_7;

public class Temperature {
    private char unit;
    private float value;

    public Temperature(char unit, float value) {
        if (unit != 'C' && unit != 'F') {
            throw new IllegalArgumentException("Invalid unit (neither celsius or fahrenheit)");
        }

        this.unit = unit;
        this.value = value;
    }

    public Temperature(float value) {
        this('C', value);
    }

    public Temperature(char unit) {
        this(unit, 0);
    }

    public Temperature() {
        this('C');
    }

    public float getFahrenheit() {
        if (this.unit == 'C') {
            return this.value * 9 / 5 + 32;
        } else {
            return this.value;
        }
    }

    public float getCelsius() {
        if (this.unit == 'F') {
            return (this.value - 32) * 5 / 9;
        } else {
            return this.value;
        }
    }

    public void setDegree(float value) {
        this.value = value;
    }

    public void setUnit(char unit) {
        this.unit = unit;
    }

    public void setTemperature(char unit, float value) {
        this.unit = unit;
        this.value = value;
    }

    public int compareTo(Temperature other) {
        if (this.unit == 'C') {
            return Float.compare(this.getCelsius(), other.getCelsius());
        } else {
            return Float.compare(this.getFahrenheit(), other.getFahrenheit());
        }
    }

    public boolean equals(Temperature other) {
        return this.compareTo(other) == 0;
    }

    public boolean isHotter(Temperature other) {
        return this.compareTo(other) > 0;
    }

    public boolean isCooler(Temperature other) {
        return this.compareTo(other) < 0;
    }
}
