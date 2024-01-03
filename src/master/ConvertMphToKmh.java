package master;

import utils.Rounder;

public class ConvertMphToKmh {
    public String convMphToKmh(double num1) {
        return roundRes(Mph(num1));
    }

    double Mph(double num1) {
        return num1 * 1.60934399;
    }

    String roundRes(double res) {
        return Rounder.roundValue(res);
    }
}