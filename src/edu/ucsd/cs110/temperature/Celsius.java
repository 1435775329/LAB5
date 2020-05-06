package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Celsius toCelsius() {
        return new Celsius(getValue());
    }

    @Override
    public Fahrenheit toFahrenheit() {
        float t = ((getValue()*9)/5)+32;
        return new Fahrenheit(t);
    }

    public String toString()
    {
        // TODO: Complete this method

        return Float.toString(getValue())+" C";
    }
}