package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Celsius toCelsius() {
        float t = ((getValue()-32)*5)/9;
        return new Celsius(t);
    }

    @Override
    public Fahrenheit toFahrenheit() {
        return new Fahrenheit(getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return Float.toString(getValue())+" F";
    }
}